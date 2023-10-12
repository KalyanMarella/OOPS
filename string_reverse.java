import java.util.*;
class string_reverse
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String To reverse: ");
		String act=sc.nextLine();
		String rev="";
		for(int i=act.length()-1;i>=0;i--)
		{
			rev=rev+act.charAt(i);
		}
		System.out.println("Reversed String: "+rev);
	}	
}
