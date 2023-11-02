import java.util.*;
class Account
{
	public String Bank_Name;
	public String Branch_Name;
	public int Act_No;
	public double Act_Balance;
	public String Address;
	public Account(double initial)
	{
		if(initial>=1000)
		{
			this.Act_Balance=initial;
		}
		else
			System.out.println("Intital Amount Should be more than 999");
	}
	public void credit(double amt)
	{
		this.Act_Balance+=amt;
		System.out.pritln("Balance Credited With"+amt+"Successfully");		
	}
	public void dedit(double amt)
	{
		if(this.Act_Balance>amt && this.Act_Balance-amt>=1000)
		{
			this.Act_Balance-=amt;
			System.out.pritln("Amount Withdrawl"+amt+"Successfully");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}		
	}
	public void getBalance()
	{
		System.out.pritln("Balance: "+amt);		
	}
	public booelan exit()
	{	
		return true;
	}
	
}
class lab44
{
	public static void main(String[] args)
	{
		HashMap<Integer,<String,Account>> map=new HashMap<>();
		
		Account act1=new Account(1000);
		act1.Bank_Name="SBI";
		act1.Branch_Name="Basar";
		act1.Act_No=123456789;
		act1.Address="Basar";
		map.put(123456789,"Basar");
			
		Account act2=new Account(1200);
		act2.Bank_Name="SBI";
		act2.Branch_Name="Basar";
		act2.Act_No=1673455789;
		act2.Address="Basar";
		map.put(1673455789,"Basar");
		
		Account act3=new Account(1500);
		act3.Bank_Name="SBI";
		act3.Branch_Name="Nizamabad";
		act3.Act_No=987653241;
		act3.Address="Nizamabad";
		map.put(987653241,"Nizamabad");
		
		Account act4=new Account(2000);
		act4.Bank_Name="SBI";
		act4.Branch_Name="Nizamabad";
		act4.Act_No=990855789;
		act4.Address="Nizamabad";
		map.put(990855789,"Nizamabad");
		
		Account act5=new Account(2000);
		act5.Bank_Name="SBI";
		act5.Branch_Name="Basar";
		act5.Act_No=887085579;
		act5.Address="Basar";
		map.put(887085579,"Basar");
		
		Account act6=new Account(2000);
		act6.Bank_Name="SBI";
		act6.Branch_Name="Nizamabad";
		act6.Act_No=990855789;
		act6.Address="Nizamabad";
		map.put(990855789,"Nizamabad");
		
		Account act7=new Account(1100);
		act7.Bank_Name="SBI";
		act7.Branch_Name="Nizamabad"
		act7.Act_No=887080079;
		act7.Address="Nizamabad";
		map.put(887080079,"Nizamabad");
		
		Account act8=new Account(2000);
		act8.Bank_Name="SBI";
		act8.Branch_Name="Basar";
		act8.Act_No=990867789;
		act8.Address="Basar";
		map.put(990867789,"Basar");
		
		Account act9=new Account(1500);
		act9.Bank_Name="SBI";
		act9.Branch_Name="Nizamabad"
		act9.Act_No=887081234;
		act9.Address="Nizamabad";
		map.put(887081234,"Nizamabad");
		
		Account act10=new Account(1700);
		act10.Bank_Name="SBI";
		act10.Branch_Name="Basar";
		act10.Act_No=990865678;
		act10.Address="Basar";
		map.put(990865678,"Basar");
		
		
		Scanner sc_chr=new Scanner(System.in);
		Scanner sc_num=new Scanner(System.in);
		System.out.println("Enter YES to start or No to exit");
		if(sc_chr.nextLine().ignoreCaseEquals("YES"))
		{
			boolean res=true;
			while res
			{
				System.out.print("Enter Account Number: ");
				int act_name=sc_num.nextInt();
				System.out.print("Enter Branch_Name: ");
				int brch_name=sc_chr.nextLine();
				try
				{
					map.get(sc_num);
					
				}
				catch(Exception e)
				{
					System.out.println("Not Account Holder of Either Bank");
				}
			}
		}
	}
}
