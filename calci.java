import java.util.Scanner;
public class calci
{
	public static void main(String[] args)
	{
		System.out.println("Enter 1 to do Addition");
		System.out.println("Enter 2 to do Subtraction");
		System.out.println("Enter 3 to do Multiplication");
		System.out.println("Enter 4 to do Division");
		Scanner sc=new Scanner(System.in);
		int flag=sc.nextInt();
		switch(flag)
		{
			case 1:
			{
				System.out.println("Enter num1:");
				int num1=sc.nextInt();
				System.out.println("Enter num2:");
				int num2=sc.nextInt();
				System.out.println(num1+num2);
				break;	
			}
			case 2:
			{
				System.out.println("Enter num1:");
				int num1=sc.nextInt();
				System.out.println("Enter num2:");
				int num2=sc.nextInt();
				System.out.println(num1-num2);
				break;	
			}
			case 3:
			{
				System.out.println("Enter num1:");
				int num1=sc.nextInt();
				System.out.println("Enter num2:");
				int num2=sc.nextInt();
				System.out.println(num1*num2);
				break;	
			}
			case 4:
			{

					System.out.println("Enter num1:");
					int num1=sc.nextInt();
					System.out.println("Enter num2:");
					int num2=sc.nextInt();
					if(num2==0)
						System.out.println("Zero Division Error");
					else
						System.out.println(num1/num2);
			}
			default:
			{
				System.out.println("Enter Valid Number");
			}
		}
		
	}
}
