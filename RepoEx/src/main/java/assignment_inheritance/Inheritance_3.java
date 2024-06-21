package assignment_inheritance;

public class Inheritance_3 extends Inheritance_2{
	float totalSal;
	public void totalsalary()
	{
		totalSal=super.bpay+super.hra-super.pf-super.deduct+super.bonus;
		System.out.println("In hand salary= "+totalSal);
	}
	
public void salaryslip()
{
	//basic pay,deductions,hra,pf,bonus and total salary.
	System.out.println("------------------------");
	System.out.println("Basic pay= Rs."+super.bpay);
	System.out.println("deduction= Rs."+super.deduct);
	System.out.println("HRA= Rs."+super.hra);
	System.out.println("PF= Rs."+super.pf);
	System.out.println("Bonus= Rs."+super.bonus);
	System.out.println("In hand salary= Rs."+totalSal);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance_3 obj=new Inheritance_3();
		obj.pay();
		obj.calcuHra();
		obj.totalsalary();
		obj.salaryslip();
	}

}
