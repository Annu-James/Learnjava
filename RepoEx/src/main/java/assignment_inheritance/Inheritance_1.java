 package assignment_inheritance;
import java.util.Scanner;
public class Inheritance_1 {
	float bpay;
	float deduct;
	float bonus;
Scanner sc=new Scanner(System.in);
	public void pay()
	{
		System.out.println("Enter your Salary");
		bpay=sc.nextFloat();
		System.out.println("Enter deduction");
		deduct=sc.nextFloat();
		System.out.println("Enter Your Bonus");
		bonus=sc.nextFloat();
	}

}