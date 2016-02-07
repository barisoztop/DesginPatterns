package com.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		Component component1 = new ConcreteComponent();
		component1 = new ConcreteDecorator(component1);
		System.out.println(component1.componentMethod());
		
		Component component2 = new ConcreteComponent2();
		component2 = new ConcreteDecorator(component2);
		component2 = new ConcreteDecoratorB(component2);
		System.out.println(component2.componentMethod());

	}

}
