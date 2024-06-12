package aggregation;

public class Studentdetails {
	int grade;
	int mark;
	StudentAddr details;
	public Studentdetails(int grade,int mark,StudentAddr details)
	{
		this.grade=grade;
		this.mark=mark;
		this.details=details;
	}
	public void show()
	{
		System.out.println(grade+" "+mark);
		System.out.println(details.sname+" "+details.city+" "+details.pin);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentAddr obj=new StudentAddr("Annu","erkm",345);
Studentdetails obj2=new Studentdetails(2,450,obj);
obj2.show();
	}

}
