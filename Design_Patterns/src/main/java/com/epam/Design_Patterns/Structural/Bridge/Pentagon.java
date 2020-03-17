package com.epam.Design_Patterns.Structural.Bridge;

public class Pentagon extends Shape{

	public Pentagon(Color c) {
		super(c);
	}


	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	} 

}

