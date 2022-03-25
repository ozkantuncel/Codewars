import java.util.stream.IntStream;

public class retained {

	public static void main(String[] args) {
		System.out.println(rev("abc dbc"));

	}
	
	/*static String rev(String org) {
		return new StringBuilder(org).reverse().toString();
	}*/
	
	static String rev(String org) {
		int i=0;
		String[] array = org.split(" ");

		for(String string:array) {
			array[i] = new StringBuilder(string).reverse().toString();
			i++;
		}
		return String.join(" ", array);
	}

}
