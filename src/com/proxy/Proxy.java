package com.proxy;

public class Proxy extends Subject {
	
	private Subject subject;

	@Override
	public void sayHello() {
		if (subject == null) {
			this.subject = new ConcreteSubject();
		}
		subject.sayHello();
	}

}
