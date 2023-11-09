import java.util.*;
abstract class Shape
{
	abstract double getArea();
	abstract double getVolume();
}
class Square extends Shape
{
	double side;
	public Square(double a){this.side=a;}
	double getArea(){return this.side*this.side;}
	double getVolume()
	{
		return 0;
	}
}
class Circle extends Shape
{
	double radius;
	public Circle(double a){this.radius=a;}
	double getArea(){return Math.PI*this.radius*this.radius;}
	double getVolume()
	{
		return 0;
	}
	
}
class Cube extends Shape
{
	double side;
	public Cube(double a){this.side=a;}
	double getArea(){return 6*this.side*this.side;}
	double getVolume(){return this.side*this.side*this.side;}
}
class Sphere extends Shape
{
	double radius;
	public Sphere(double a){this.radius=a;}
	double getArea(){return 4*Math.PI*this.radius*this.radius;}
	double getVolume(){return (4/3)*Math.PI*this.radius*this.radius*this.radius;}
}
class lab51
{
	public static void main(String[] args)
	{
		Square obj1= new Square(5);
		Circle obj2= new Circle(5);
		Cube obj3= new Cube(5);
		Sphere obj4= new Sphere(5);
		System.out.println("Area of Square: "+obj1.getArea());
		System.out.println("Area of Circle: "+obj2.getArea());
		System.out.println("Area of Cube: "+obj3.getArea());
		System.out.println("Volume of Cube: "+obj3.getVolume());
		System.out.println("Area of Sphere: "+obj4.getArea());
		System.out.println("Volume of Sphere: "+obj4.getVolume());
	}
	
}
