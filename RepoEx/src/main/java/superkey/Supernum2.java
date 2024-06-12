package superkey;

public class Supernum2 extends SuperNum{
	int speed=200;
	public void num2()
	{
		System.out.println(speed);
		System.out.println(super.speed);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supernum2 obj=new Supernum2();
obj.num2();
	}

}
