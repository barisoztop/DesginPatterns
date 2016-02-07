package com.decorator;

public class ConcreteDecoratorB extends Decorator {
	
	private Component component;

	public ConcreteDecoratorB(Component component) {
		this.component = component;
	}

	@Override
	public String componentMethod() {
		return component.componentMethod() + " + Decorator B";
	}

}
