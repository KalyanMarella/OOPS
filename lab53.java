interface Vechile
{
	public getCompany();
	public getModel();
	public getType();
	public getConsumption();
	
}
class TwoWheeler implements Vechile
{
	private int milage;
	String Company;
	String Model;
	String Type;
	public Twowheeler(String cmpy,String mdl,String typ)
	{
		this.Company=cmpy;
		this.Model=mdl;
		this.Type=typ;
		if(typ.IgnoreCaseEquals("Petrol"))
		{
			this.Type="Petrol;
			this.milage=62;
		}
		else if(typ.IgnoreCaseEquals("Diesel"))
		{
			this.Type="Diesel;
			this.milage=82;
		}
		else if(typ.IgnoreCaseEquals("Cng"))
		{
			this.Type="Cng";
			this.milage=72;
		}
	}
	void getCompany()
	{
		System.out.println(this.Company);
	}
	void getModel()
	{
		System.out.println(this.Model);
	}
	void getType()
	{
		System.out.println(this.Type);
	}
	void getConsumption()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Distance Travelled");
		double dist=sc.nextDouble();
		System.out.println("Fuel Consumed: ",double(dist/this.milage));
	}
}
class FourWheeler implements Vechile
{
	private int milage;
	String Company;
	String Model;
	String Type;
	public Twowheeler(String cmpy,String mdl,String typ)
	{
		this.Company=cmpy;
		this.Model=mdl;
		this.Type=typ;
		if(typ.IgnoreCaseEquals("Petrol"))
		{
			this.Type="Petrol;
			this.milage=14;
		}
		else if(typ.IgnoreCaseEquals("Diesel"))
		{
			this.Type="Diesel;
			this.milage=22;
		}
		else if(typ.IgnoreCaseEquals("Cng"))
		{
			this.Type="Cng";
			this.milage=18;
		}
	}
	void getCompany()
	{
		System.out.println(this.Company);
	}
	void getModel()
	{
		System.out.println(this.Model);
	}
	void getType()
	{
		System.out.println(this.Type);
	}
	void getConsumption()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Distance Travelled");
		double dist=sc.nextDouble();
		System.out.println("Fuel Consumed: ",double(dist/this.milage));
	}
}
class lab53
{
	public static void main(String[] args)
	{
		TwoWheeler vech1=new TwoWheeler("Honda","2022","Petrol");
		TwoWheeler vech2=new TwoWheeler("Royal Enfield","2023","Petrol");
		FourWheeler vech3=new FourWheeler()
	}
}
