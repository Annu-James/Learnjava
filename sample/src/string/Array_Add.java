package string;

public class Array_Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{10,20,30},{40,50,55},{35,45,50}};
int b[][]= {{5,15,20},{25,30,40},{55,60,45}};
int c[][]=new int[3][3];
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<b.length;j++)
		{
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+" ");
		}
	System.out.println();
	}
	}

}
