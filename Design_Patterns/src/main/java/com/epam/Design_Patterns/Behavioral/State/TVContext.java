package com.epam.Design_Patterns.Behavioral.State;

public class TVContext implements State {

	private State tvState;

	public void setState(State state) {
		this.tvState=state;
	}

	public State getState() {
		return this.tvState;
	}

	
	public void doAction() {
		this.tvState.doAction();
	}

}