import java.util.*;
public class Stall
{
	public String Product_Id;
	public String Product_Name;
	public int Product_Qty;
	public double Product_Price;
	public Stall(String id,String name,int qty,double price)
	{
		this.Product_Id=id;
		this.Product_Name=name;
		this.Product_Qty=qty;
		this.Product_Price=price;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner chr=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Id of the Product: ");
			String id=chr.nextLine();
			System.out.print("Enter Name of the Product: ");
			String name=chr.nextLine();
			System.out.print("Enter Quantity of the Product: ");
			String qty=chr.nextLine();
			
		}
	}	
}
