class A {
	int a = 5;
}

class B extends A {
	B() {
		System.out.println(super.a);
	}
}

public class Lab66 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
	}
}