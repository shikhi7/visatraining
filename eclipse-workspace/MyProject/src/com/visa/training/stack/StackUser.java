package com.visa.training.stack;
import java.util.Random;

interface Stack{
	public void push (Object element);
	public Object pop();
	public void printTop();
}

class fixedArrayStack implements Stack {
	
	Object[] stack;
	int top;
	
	public fixedArrayStack() {
		super();
		this.stack = new Object[100];
		this.top = -1;
	}
	
//	@Override
	
	public void push(Object element) {
		this.top ++;
		this.stack[top] = element;
	}
	
	public Object pop() {
		this.top --;
		return stack[top+1];
	}
	
	public void printTop() {
		if (top>=0) {
			System.out.println(this.stack[top]);
		}
		else System.out.println("Stack is empty");
	}
	
}
public class StackUser {
	
	public void fill(Stack s) {
		Random r = new Random();
		for (int i=0; i<10; i++) {
			s.push(r.nextInt(100));
			s.printTop();
		}
	}
	
	public void empty(Stack s) {
		for (int i = 0; i < 10; i++) {
			System.out.println(s.pop());
		}
	}
	
	public static void main(String[] args) {
		fixedArrayStack newStack = new fixedArrayStack();
		StackUser newStackUser = new StackUser();
		newStackUser.fill(newStack);
		newStackUser.empty(newStack);
	}
}
