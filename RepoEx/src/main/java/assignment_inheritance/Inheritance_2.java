package assignment_inheritance;

public class Inheritance_2 extends Inheritance_1{
	float hra;
	float pf;
	public void calcuHra()
	{
		hra=super.bpay*0.05f;
		pf=super.bpay*.20f;
		//System.out.println("pf= "+pf);
		//System.out.println("HRA= "+hra);
		
	}

}
