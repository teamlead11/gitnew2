package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseclassMethods();
		BaseClass b = new BaseClass();
		b.add(1, 2, 3);
	}

	public static void baseclassMethods() {
		System.out.println("3rd modified logic");
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}
