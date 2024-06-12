package multilevel_inheritance;

public class Good1 extends Good{
	public void wish()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Good1 obj=new Good1();
obj.wish();
obj.gm();
	}
}
