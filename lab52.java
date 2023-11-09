abstract class Employee
{
	abstract double getAmount();
}
class HourlyEmployee extends Employee
{	
	double tot;
	double hrs;
	double money;
	public HourlyEmployee(double w,double t,double m)
	{
		this.tot=t;
		this.hrs=w;
		this.money=m;
	}
	double getAmount()
	{
		return (this.hrs/this.tot)*this.money;
	}
}
class WeeklyEmployee extends Employee
{
	double tot;
	double wks;
	double money;
	public WeeklyEmployee(double w,double t,double m)
	{
		this.tot=t;
		this.wks=w;
		this.money=m;
	}
	double getAmount()
	{
		return (this.wks/this.tot)*this.money;
	}
}
class lab52
{
	public static void main(String[] args)
	{
		HourlyEmployee emp1=new HourlyEmployee(7,8,20000);
		WeeklyEmployee emp2=new WeeklyEmployee(10,50,20000);
		System.out.println("Amount: "+emp1.getAmount());
		System.out.println("Amount: "+emp2.getAmount());
	}
}


