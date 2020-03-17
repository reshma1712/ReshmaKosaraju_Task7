package com.epam.Design_Patterns.Structural.Bridge;

public class Triangle extends Shape{

	public Triangle(Color c) {
		super(c);
	}


	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	} 

}


