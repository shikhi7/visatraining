package com.visa.training.stack;

import java.util.ArrayList;

public class circle {
	double radius;
	float[] centre = new float[2];
	
	public circle(double radius, float[] centre) {
		super();
		this.radius = radius;
		this.centre[0] = centre[0];
		this.centre[1] = centre[1];
	}
	
	public double area () {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	public static void main(String[] args) {
		ArrayList<circle> circs = new ArrayList<circle>(100);
		double r = Math.random();
		while(r>=0.01) {
			float[] cen = new float[]{1,2}; 
			circle newcir = new circle(r, cen); 
			circs.add(newcir);
		}
		System.out.println("The length of list of circles is "+ circs.size());
		for (circle cir: circs) {
			
		}
	}
}
