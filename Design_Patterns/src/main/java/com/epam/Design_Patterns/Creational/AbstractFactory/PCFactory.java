package com.epam.Design_Patterns.Creational.AbstractFactory;

import com.epam.Design_Patterns.model.Computer;
import com.epam.Design_Patterns.model.PC;

public class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}

	public Computer createComputer() {
		return new PC(ram,hdd,cpu);
	}

}
