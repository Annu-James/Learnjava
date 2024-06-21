package assignment_polymor;

public class Onseason extends Offseason {
	public void discount(double a)
	{
		super.discount(4500);
		double b=a*.4d;
		double c=a-b;
		System.out.println("Onseason discount: "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Onseason obj=new Onseason();
obj.discount(5000);
	}

}
