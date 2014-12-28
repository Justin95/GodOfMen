package com.GodOfMen.mathUtil;

public class Vector2D {
	
	private double iHat;
	private double jHat;
	
	public Vector2D(double x, double y){
		this.iHat = x;
		this.jHat = y;
	}
	
	
	
	/**
	 * 
	 * @return the iHat of this Vector2D. Also known as the X component.
	 */
	public double getIHat(){
		return this.iHat;
	}
	
	
	/**
	 * 
	 * @return the jHat of this Vector2D. Also known as the Y component.
	 */
	public double getJHat(){
		return this.jHat;
	}
	
}
