class Animal
{
	public void make_sound()
	{
		System.out.println("Parent_class-");
		
	}
}
class Dog extends Animal
{
	public void make_sound()
	{
		System.out.println("Dog_class-");
	}
}
class Cat extends Animal
{
	public void make_sound()
	{
		System.out.println("Cat_class-");
	}
}
class upcast_downcast
{
	static void makeAnimalStuff(Animal a)
	{
		a.make_sound();
	}
	public static void main(String[] args)
	{
		Dog d=new Dog();
		makeAnimalStuff(d);
		Cat c=new Cat();
		makeAnimalStuff(c);
	}
}
