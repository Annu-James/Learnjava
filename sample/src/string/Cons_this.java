package string;

public class Cons_this {
	public Cons_this()
	{
		int a=40;
		System.out.println(a);
		
	}
	public Cons_this(int b)
	{
		this();
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cons_this obj=new Cons_this(10);
	}

}
