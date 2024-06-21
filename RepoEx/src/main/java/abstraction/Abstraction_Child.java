package abstraction;

public class Abstraction_Child extends Abstraction_Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction_Child obj=new Abstraction_Child();
		obj.add();
		obj.multiply();
	}

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		int x=46;
		int y=32;
		int z=x*y;
		System.out.println(z);
	}

}
