import java.util.*;
import java.lang.*;

class Shape
{
	public double  getArea(int a)
	{
		return a*a;
	}
	public double getPerimeter(int a)
	{
		return 4*a;
	}
	public double getArea(double radius)
	{
		return Math.PI*radius*radius;
	}
	public double getPerimeter(double radius)
	{
		return 2*Math.PI*radius;
	}
	public double  getArea(double a,double b)
	{
		return a*b;
	}
	public double getPerimeter(double a,double b)
	{
		return 2*(a+b);
	}
}
class Square extends Shape
{
	public int side;
}
class Rectangle extends Shape
{
	public double length;
	public double breadth;
}
class Circle extends Shape
{
	public double  radius;
}
public class lab41
{
	public static void main(String[] args)
	{
		Square sq=new Square();
		sq.side=4;
		Circle cl=new Circle();
		cl.radius=3;
		Rectangle rect=new Rectangle();
		rect.length=4;
		rect.breadth=3;
		
		System.out.println("Square_Area: "+sq.getArea(sq.side));
		System.out.println("Square_Perimeter: "+sq.getPerimeter(sq.side));
		System.out.println("Rectangle_Area: "+rect.getArea(rect.length,rect.breadth));
		System.out.println("Rectangle_Perimeter: "+rect.getPerimeter(rect.length,rect.breadth));
		System.out.println("Circle_Area: "+cl.getArea(cl.radius));
		System.out.println("Circle_Perimeter: "+cl.getPerimeter(cl.radius));
	}
}
