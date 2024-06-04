package JavaBasics;

public class Eceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[5];
			a[5]=50/5;
			int c=23/0;
			System.out.println(5);
			}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("you can not divide by zero");
			
		}
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println(o);
			
		}
System.out.println("yup no exception");
	}

}
