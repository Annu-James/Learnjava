package exception;

public class Customs_ex {
	
	public void licence(int a) throws DriveException
	{
		if(a<18)
		{
			System.out.println("Eligible to drive");
		}
		else
		{
			throw new DriveException("Invalid");
		}
		
	}

	public static void main(String[] args) throws DriveException  {
		// TODO Auto-generated method stub
		Customs_ex obj=new Customs_ex();
		obj.licence(15);
	}

}
