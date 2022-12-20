package week3.Assignment;

public class Palindrome {
	
	


	public static void main(String[] args) {

String name="madam";
String rev="";
for(int i=name.length()-1; i>=0;i--)
{
	rev=rev+name.charAt(i);
}
System.out.println(rev);

if(name.equals(rev))
{
	System.out.println("Palindrome");
}
else
{
	System.out.println("Not a palindrome");
	}
}

	





	}


