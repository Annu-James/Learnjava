package string;

public class Add_this {
	int a=50;
	int b=35;
	public void add()
	{
		int c=a+b;
		System.out.println(c);
		this.sub();
	}
public void sub()
{
int d=a-b;
System.out.println(d);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Add_this obj=new Add_this();
obj.add();
	}

}
