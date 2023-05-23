class B {

	void meth(int a, int b) {
		System.out.println(a + b);
	}

	void meth(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

class C extends B {
	@Override
	void meth(int a, int b) {
		System.out.println("overriden" + a + b);
	}

	@Override
	void meth(int a, int b, int c) {
		System.out.println("overriden" + a + b + c);
	}
}

public class Main2 {
	public static void main(String[] args) {
		C b = new C();
		b.meth(10, 10);
		b.meth(1, 2, 3);

	}
}
