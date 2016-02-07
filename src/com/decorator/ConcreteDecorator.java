package com.decorator;

public class ConcreteDecorator extends Decorator {
	
	private Component component;

	public ConcreteDecorator(Component component) {
		this.component = component;
	}

	@Override
	public String componentMethod() {
		return component.componentMethod() + " + Decorator A";
	}

}
