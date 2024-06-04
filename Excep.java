package JavaBasics;

public class Excep {

	public static void main(String[] args) {
		try {
			int a = 10, b = 0, c;
			c = a / b;
			System.out.println("The division is: " + c);
		} 
		catch (ArithmeticException e) {
			System.out.println("Error: " + e);
		}
	}

}
