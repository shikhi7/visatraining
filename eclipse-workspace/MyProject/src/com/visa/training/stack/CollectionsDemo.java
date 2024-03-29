package com.visa.training.stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Circle {
	double radius;
//	float[] centre = new float[2];
	
	public Circle(double radius) {
		super();
		this.radius = radius;
//		this.centre[0] = centre[0];
//		this.centre[1] = centre[1];
	}
	
	public double getRadius() {
		return radius;
	}

	public double area () {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
//	public static void main(String[] args) {
////		ArrayList<circle> circs = new ArrayList<circle>(100);
//		double r = Math.random();
//		while(r>=0.01) {
//			float[] cen = new float[]{1,2}; 
//			circle newcir = new circle(r, cen); 
//			circs.add(newcir);
//		}
//		System.out.println("The length of list of circles is "+ circs.size());
//		for (circle cir: circs) {
//			
//		}
//	}
}


public class CollectionsDemo {
	
	public static void main(String[] args) {
		listsDemo();
		mapDemo();
	}

	private static void mapDemo() {
		// TODO Auto-generated method stub
		Map<String, String> emp = new HashMap<>();
		emp.put("E124","Gates");
		emp.put("E234","Jobs");
		emp.put("E876","Page");
		emp.put("E186","Zuck");
		emp.put("E250","Ellison");
//		while(true) {
//			
//		}
	}

	private static void listsDemo() {
		// TODO Auto-generated method stub
		List<Circle> circles = new ArrayList<Circle>();
		double r = Math.random();
		while(r>=0.01) {
//			float[] cen = new float[]{1,2}; 
			Circle newcir = new Circle(r); 
			circles.add(newcir);
			r = Math.random();
		}
		System.out.println("The length of list of circles is "+ circles.size());
		for (Circle c:circles) {
//			System.out.println(c.area());
		}
//		wrong impl below
//		for (Circle c: circles) {
//			if(c.getRadius() < 0.5) {
//				circles.remove(c);
//			}
//		}
		Iterator<Circle> it = circles.iterator();
		while (it.hasNext()) {
			Circle c = it.next();
			if (c.getRadius()<0.5) {
				it.remove();
			}
		}
		System.out.println("The length of list of circles is "+ circles.size());
	}
}
