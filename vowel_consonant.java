import java.util.*;
public class vowel_consonant
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String text=sc.nextLine();
		String aux="aAeEiIoOuU";
		int vw=0,cnst=0;
		for(int i=0;i<text.length();i++)
		{
			if(aux.indexOf(text.charAt(i))!=-1)
			{
				System.out.print(text.charAt(i)+" ");
				vw+=1;
			}
			else
				cnst+=1;
		}
		System.out.print("\nVowel Count: "+vw+"\nConsonant Count: "+cnst+"\n");
	}
}
