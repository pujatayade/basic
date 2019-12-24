package Basic_programs;

public class Swapping {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp = 0;
		System.out.println("Before swapping value :");
		System.out.println("a is " +a);
		System.out.println("b is " +b);
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("Afterswapping value :");
		System.out.println("a is " +a);
		System.out.println("b is "+b);
		
	}

}
