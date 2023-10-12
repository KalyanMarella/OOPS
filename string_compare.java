import java.util.*;
public class string_compare
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String_1: ");
		String strg1=sc.nextLine();
		System.out.print("Enter String_2: ");
		String strg2=sc.nextLine();
		System.out.println(strg1.compareTo(strg2));
	}
}
