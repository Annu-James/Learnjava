package assignment_aggregation;

public class Address {
	String city;
	int pin;
	String state;
	Student det;
	public Address(String city,int pin,String state,Student det)
	{
		this.city=city;
		this.pin=pin;
		this.state=state;
		this.det=det;
	}
public void details()
{
    System.out.println(det.sname+" "+det.rollnum);
	System.out.println("Address:"+city+", "+pin+", "+state);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student("Arya",25);
		Address obj1=new Address("cochi",234567,"Kerala",obj);
		obj1.details();

	}

}
