package overrideOverload;

public class MainApp {

	public static void main(String[] args) {
		A a = new A();
		a.fun();
		B b = new B();
		A ab = new B();
		b.fun();
		b.fun(8);
		ab.fun();
//		ab.fun(8);
	}

}
