package JavaBasics;

import java.util.Scanner;

public class CustomEx1 {
	public void check1(int a)
	{
		
		
		if(a<=18)
		{
			throw new ArithmeticException("you are not elligible for voting!!!");
		}
		else
		{
			System.out.println("it is your Right to vote!!!"); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomEx1 obj=new CustomEx1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		obj.check1(age);

	}

	private void check(int age) {
		// TODO Auto-generated method stub
		
	}

}
