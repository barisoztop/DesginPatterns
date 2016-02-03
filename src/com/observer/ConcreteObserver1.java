package com.observer;

public class ConcreteObserver1 implements IObserver {

	@Override
	public void update(int subjectsUpdatedValue) {
		System.out.println("Observer 1 - Subject's new value: " + subjectsUpdatedValue);
	}

}
