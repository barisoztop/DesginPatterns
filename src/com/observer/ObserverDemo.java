package com.observer;

public class ObserverDemo {
	
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		ConcreteObserver1 observer1 = new ConcreteObserver1();
		ConcreteObserver2 observer2 = new ConcreteObserver2();
		subject.registerObserver(observer1);
		subject.registerObserver(observer2);
		subject.setValueToBeObserved(0);
		subject.removeObserver(observer2);
		subject.setValueToBeObserved(1);
		

	}

}
