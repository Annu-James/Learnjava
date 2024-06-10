package string;

public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Java";
		String b=a.toLowerCase();
		int c=0;
for(int i=0;i<b.length();i++)
{
	if(b.charAt(i)==b.charAt(b.length()-i-1))
	{
		c=c+1;
	}
}
if(c==b.length())
{
System.out.println(a+" is a Palindrome");	
}
else
{
System.out.println(a+" not a palindrome");	
}
	}
}
