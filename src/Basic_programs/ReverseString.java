package Basic_programs;

public class ReverseString {
	public static void main(String[] args) {

		String str = "Hello";
		String revstring = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revstring = revstring + str.charAt(i);

		}
		System.out.println(revstring);
	}

}
