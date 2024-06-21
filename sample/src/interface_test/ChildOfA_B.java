package interface_test;

public class ChildOfA_B implements Parent_A,Parent_B{
	public void divide()
	{
		int m=200;
		int n=2;
		int o=m/n;
		System.out.println("Division= "+o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildOfA_B obj=new ChildOfA_B();
		obj.sum();
		obj.sub();
		obj.divide();
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int x=500;
		int y=432;
		int z=x-y;
		System.out.println(z);
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int a=689;
		int b=4534;
		int c=a+b;
		System.out.println("Sum= "+c);
	}

}
