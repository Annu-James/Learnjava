package aggregation;

public class EmployeeD2{
	String area;
	int busnum;
	EmployeeDetail ad;
	public EmployeeD2(String area,int busnum,EmployeeDetail ad)
	{
		this.area=area;
		this.busnum=busnum;
		this.ad=ad;
	}
	public void show()
	{
		System.out.println(ad.eName+" "+ad.employeeId);
		System.out.println(area+" "+busnum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetail obj=new EmployeeDetail("Arya",349008);
		EmployeeD2 obj2=new EmployeeD2("Erkm",500,obj);
		obj2.show();
		
	}

}
