import java.util.Scanner;
public class prime_factor
{
	boolean prime(int num)
	{
		int ct=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				ct+=1;
			
		}
		if(ct==2)
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		prime_factor fn=new prime_factor();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				if(fn.prime(i))
					System.out.println(i);
			}
		}
	}
}
