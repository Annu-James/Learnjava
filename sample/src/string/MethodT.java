package string;

public class MethodT {
	public void add(int x,int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodT obj=new MethodT();
obj.add(30,20);
obj.sub(8,5);
	}

}
