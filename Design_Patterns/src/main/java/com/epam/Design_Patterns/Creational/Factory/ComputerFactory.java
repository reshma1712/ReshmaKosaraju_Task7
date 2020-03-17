package com.epam.Design_Patterns.Creational.Factory;

import com.epam.Design_Patterns.model.Computer;
import com.epam.Design_Patterns.model.PC;
import com.epam.Design_Patterns.model.Server;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		
		return null;
	}
}
