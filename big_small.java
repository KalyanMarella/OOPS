import java.util.Scanner;
public class big_small
{
	int big_and_small(int ...arr)
	{
		int big=arr[0];
		int small=arr[0];
		for(int i:arr)
		{
			if(big<i)
				big=i;
			else if(small>i)
				small=i;
		}
		System.out.println("Big: "+big+"\nSmall: "+small);
		return 0;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num1:");
		int num1=sc.nextInt();
		System.out.println("Enter Num2:");
		int num2=sc.nextInt();
		System.out.println("Enter Num3:");
		int num3=sc.nextInt();
		System.out.println("Enter Num4:");
		int num4=sc.nextInt();
		System.out.println("Enter Num5:");
		int num5=sc.nextInt();
		big_small fn=new big_small();
		fn.big_and_small(num1,num2,num3,num4,num5);
		
	}
}
