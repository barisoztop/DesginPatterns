package com.observer;

public class ConcreteObserver2 implements IObserver {

	@Override
	public void update(int subjectsUpdatedValue) {
		System.out.println("Observer 2 - Subject's new value: " + subjectsUpdatedValue);
	}

}
