package com.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject {
	
	private List<IObserver> observers = new ArrayList<IObserver>();
	private int valueToBeObserved;

	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (IObserver observer : observers) {
			observer.update(valueToBeObserved);
		}
	}

	public int getValueToBeObserved() {
		return valueToBeObserved;
	}

	public void setValueToBeObserved(int valueToBeObserved) {
		this.valueToBeObserved = valueToBeObserved;
		notifyObservers();
	}

}
