package assignment_superkey;

public class Super_Key2 extends Super_Key {
float c;
public void division()
	{
	c=super.c/10;	
	System.out.println("result by 10: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Super_Key2 obj=new Super_Key2();
obj.add();
obj.division();

	}

}
