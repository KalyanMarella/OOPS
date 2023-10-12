import java.util.*;
public class alphabet_occurence
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Text: ");
		String text=sc.nextLine();
		System.out.print("Enter Alphabet to check it Occurences: ");
		String alpha=sc.nextLine();
		int index=0,ct=-1;
		int state=text.indexOf(alpha,index);
		while(state!=-1)
		{
			state=text.indexOf(alpha,index);
			ct+=1;
			index=state+1;
		}
		System.out.print(ct);
	}
}
