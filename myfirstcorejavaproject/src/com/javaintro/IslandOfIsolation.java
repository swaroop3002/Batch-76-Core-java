package com.javaintro;

class A {
	B b; // b-->is reference variable

}

class B {
	A a;
}

public class IslandOfIsolation {

	A a1 = new A();

	@Override
	protected void finalize() throws Throwable {
		System.out.println("object removed");
	}

	public static void main(String[] args) {

		System.out.println("main method started");
		// Island of isolation
		A obj1 = new A();
		B obj2 = new B();

		obj1.b = obj2;
		obj2.a = obj1;

		IslandOfIsolation is = new IslandOfIsolation();
		is = null;

		System.gc();

	}

}
