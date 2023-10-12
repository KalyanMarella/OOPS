import java.util.Scanner;
import java.lang.Math;
public class quad_root
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Coefficient of X^2");
		float a= sc.nextFloat();
		//System.out.println(a);
		System.out.println("Enter Coefficient of X");
		float b= sc.nextFloat();
		System.out.println("Enter Constant");
		float c= sc.nextFloat();
		float dsrt=b*b-4*a*c;
		if (dsrt>0)
		{
			float x1=(float)(-1*b+Math.sqrt(dsrt))/2*a;
			float x2=(float)(-1*b-Math.sqrt(dsrt))/2*a;
			System.out.println(x1+"\n"+x2);
		}
		else if(dsrt==0)
		{
			float x1=(float)(-1*b+Math.sqrt(dsrt))/2*a;
			float x2=(float)(-1*b-Math.sqrt(dsrt))/2*a;
			System.out.println(x1+"\n"+x2);
		}
		else
		{
			float x11=(float)(-b/2*a);
			float x12=(float)(Math.sqrt(-1*dsrt))/2*a;
			System.out.println(x11+"+i"+x12);
			
			float x21=(float)(-1*b/2*a);
			float x22=(float)(Math.sqrt(-1*dsrt))/2*a;
			System.out.println(x21+"-i"+x22);

		}
		
	}
}
