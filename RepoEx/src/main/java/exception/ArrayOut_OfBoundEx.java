package exception;

public class ArrayOut_OfBoundEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
int a[]=new int[4];
a[0]=5;
a[1]=10;
a[2]=15;
a[3]=20;
a[4]=22;
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);	
}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Invalid");
		}
	}

}
