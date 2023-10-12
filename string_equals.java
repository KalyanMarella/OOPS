import java.util.*;
public class string_equals
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String_1: ");
		String strg1=sc.nextLine();
	    System.out.print("Enter String_2: ");
		String strg2=sc.nextLine();
		if(strg1.equals(strg2))
			System.out.println(strg1+" and "+strg2+" are equal");
		else if (strg1.equalsIgnoreCase(strg2))
			System.out.println(strg1+" and "+strg2+" are equal");
		else
			System.out.println(strg1+" and "+strg2+" are not equal");
	}
}
