package Basic_programs;

public class SwappingWithout {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping value:");
		System.out.println("a is " + a);
		System.out.println("b is " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping value:");
		System.out.println("a is " + a);
		System.out.println("b is " + b);
	}

}
