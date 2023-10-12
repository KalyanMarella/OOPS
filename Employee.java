import java.util.*;
public class Employee
{
	public String emp_id;
	public String emp_name;
	public int emp_age;
	public String emp_gender;
	public String emp_designation;
	public double emp_salary;
	public String emp_address;
	public Employee(String id,String ep_na,int ep_ag,String ep_gen,String desig,double sal,String addr)
	{
		this.emp_id=id;
		this.emp_name=ep_na;
		this.emp_age=ep_ag;
		this.emp_gender=ep_gen;
		this.emp_designation=desig;
		this.emp_salary=sal;
		this.emp_address=addr;
	}
	public static void main(String[] args)
	{
		Scanner sc_num=new Scanner(System.in);
		Scanner sc_chr=new Scanner(System.in);
		System.out.print("Enter No.of Employees: ");
		int n=sc_num.nextInt();
		Employee arr[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter ID of the Employee: ");
			String id=sc_chr.nextLine();
			System.out.print("Enter Name of the Employee: ");
			String name=sc_chr.nextLine();
			System.out.print("Enter Age of the Employee: ");
			int age=sc_num.nextInt();
			System.out.print("Enter Gender of the Employee: ");
			String gender=sc_chr.nextLine();
			System.out.print("Enter Designation of the Employee: ");
			String desig=sc_chr.nextLine();
			System.out.print("Enter Salary of the Employee: ");
			double sal=sc_num.nextDouble();
			System.out.print("Enter Address of the Employee: ");
			String addr=sc_chr.nextLine();
			arr[i]=new Employee(id,name,age,gender,desig,sal,addr);
		}
		System.out.print("Enter Id of the Employee to get Details:v ");
		String id=sc_chr.nextLine();
		for(int i=0;i<n;i++)
		{
			if(arr[i].emp_id.equals(id))
			{
				System.out.println("ID: "+arr[i].emp_id);
				System.out.println("Name: "+arr[i].emp_name);
				System.out.println("Age: "+arr[i].emp_age);
				System.out.println("Gender: "+arr[i].emp_gender);
				System.out.println("Designation: "+arr[i].emp_designation);
				System.out.println("Salary: "+arr[i].emp_salary);
				System.out.println("Address: "+arr[i].emp_address);
			}
		}
	}
}
