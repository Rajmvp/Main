class A {

	void meth(int a, int b) {
		System.out.println(a + b);
	}

	void meth(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

public class Main {
	public static void main(String[] args) {
		A m = new A();
		m.meth(2, 3);
		m.meth(2, 3, 4);
	}

}
