package com.epam.Design_Patterns.Structural.Adapter;

public interface SocketAdapter {

	public Volt get120Volt();
		
	public Volt get12Volt();
	
	public Volt get3Volt();
}