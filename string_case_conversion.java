import java.util.*;
public class string_case_conversion
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String text=sc.nextLine();
		System.out.print(text.toUpperCase()+"\n");
		System.out.print(text.toLowerCase()+"\n");
	}
}
