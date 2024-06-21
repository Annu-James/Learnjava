package abstraction;

public class Wishnum2 extends Wishnum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wishnum2 obj=new Wishnum2();
		obj.wish();
		obj.num();
	}

	@Override
	public void num() {
		// TODO Auto-generated method stub
		int a=30;
		int b=40;
		int c=a+b;
		System.out.println(c);
	}

}
