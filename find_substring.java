import java.util.*;
public class find_substring
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Main String: ");
		String text=sc.nextLine();
		System.out.print("Enter SubString: ");
		String subst=sc.nextLine();
		int flag=0;
		for(int i=0;i<text.length()-subst.length();i++)
		{
			if(subst.equals(text.substring(i,i+subst.length())))
			{
				System.out.print("Found at Index: "+i);
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.print("Not Found");
	}
}
