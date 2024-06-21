package exception;

public class Throws_License {

		public void license(int age) throws LicenseException
		{
			if(age>18)
			{
				System.out.println("Eligible to get license");
			}
			else
			{
				throw new LicenseException("Not eligible");
			}
		}

	public static void main(String[] args) throws LicenseException  {
		// TODO Auto-generated method stub
		Throws_License obj=new Throws_License();
	 obj.license(13);	
	}

}
