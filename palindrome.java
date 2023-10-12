import java.util.Scanner;
public class palindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=sc.nextInt();
		int temp=num;
		int rem,sum=0;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		if(num==sum)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
