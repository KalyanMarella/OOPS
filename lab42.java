import java.util.*;
class Person
{
	public String Name;
	public String Address;
	public String getName()
	{
		return this.Name;
	}
	public String getAddress()
	{
		return this.Address;
	}
	public void setAddress(String add)
	{
		this.Address=add;
	}
}
class Teacher extends Person
{
	public int numCourses;
	List<String> course=new ArrayList<>();
	public Teacher(String nm,String adds)
	{
		this.Name=nm;
		this.Address=adds;
	}
	public void addCourse(String crs)
	{
		if(this.course.size()>=5)
			System.out.println("Maximum Courses Selected");
		else
		{
			this.course.add(crs);
			System.out.println("Course Added Successfully");
		}
	}
}
class Student extends Person
{
	public int numCourses;
	List<String> course=new ArrayList<>();
	List<Double> grade=new ArrayList<>();
	public Student(String nm,String ads)
	{
		this.Name=nm;
		this.Address=ads;
	}
	public void addCourseGrade(String crs,double grd)
	{
		if(this.course.size()==30)
			System.out.print("Maximum Courses Selected");
		else
		{
			this.course.add(crs);
			this.grade.add(grd);
			System.out.println("Course Added Successfully");
		}
	}
	public void printGrade()
	{
		for(int i=0;i<this.grade.size();i++)
			System.out.println(this.grade.get(i));
	}
	public double getAverageGrade()
	{
		double sum=0;
		int n=this.grade.size();
		for(int i=0;i<grade.size();i++)
			sum+=this.grade.get(i);
		return sum/n;		
		
	}
}
public class lab42
{
	public static void main(String[] args)
	{
		Student stu=new Student("Hello","Basar");
		stu.addCourseGrade("Java",10);
		Teacher tch=new Teacher("Jai","Nizamabad");
		tch.addCourse("Java");
		System.out.println("Name of the Student: "+stu.getName());
		System.out.println("Name of the Teacher: "+tch.getName());
		System.out.println("Total Average Grade: "+stu.getAverageGrade());
	}
}
