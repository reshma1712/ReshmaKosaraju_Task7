package com.epam.Design_Patterns.Creational.AbstractFactory;

import com.epam.Design_Patterns.model.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}