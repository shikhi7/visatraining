package com.visa.training.threads;

public class Buffer {
    
    int data;
    boolean available = false;
    
    public synchronized void produce(int newData) {
        while(available) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
        System.out.println("Producer producing --> "+newData);
        data = newData;
        available = true;
        this.notify();
    }
    
    public synchronized int consume() {
        while(!available) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
        System.out.println("Consumer consuming --> "+data);
        available = false;
        this.notify();
        return data;
    }

}


package com.visa.training.threads;

public class Producer extends Thread {
    
    Buffer buffer;

    public Producer(Buffer buffer) {
        super();
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            buffer.produce(i);
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}


package com.visa.training.threads;

public class Consumer extends Thread {
    
    Buffer buffer;

    public Consumer(Buffer buffer) {
        super();
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            buffer.consume();
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}


package com.visa.training.threads;

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();
        System.out.println("Started producer and consumer");

    }

}

