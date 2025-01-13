package overrideOverload;

public class B extends A {
	public void fun() {
		System.out.println("Fun B");
	}

	public void fun(int a) {
		System.out.println("Fun B : Val :: " + a);
	}
}
