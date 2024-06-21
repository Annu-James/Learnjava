package polymorphism_Ex;

public class PolymorphEx2 extends Polymorph1{
	public void add(float a,float b)
	{
		//super.add(30,40);
		float c=a+b;
		System.out.println("Sum is: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PolymorphEx2 obj=new PolymorphEx2();
obj.add(40.50f,30.20f);
Polymorph1 obj2=new Polymorph1();
obj2.add(30, 40);
	}

}
