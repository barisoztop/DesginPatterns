package com.observer;

public interface ISubject {

	public void registerObserver(IObserver observer);
	public void removeObserver(IObserver observer);
	public void notifyObservers();
	
}
