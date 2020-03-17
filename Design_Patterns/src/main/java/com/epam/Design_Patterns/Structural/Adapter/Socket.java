package com.epam.Design_Patterns.Structural.Adapter;

public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}