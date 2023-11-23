package Calculator;

interface calci
{
	abstract int add(int a,int b);	
	abstract int subtraction(int a,int b);
	abstract int multiplication(int a,int b);
	abstract int division(int a,int b);
}
public class calculate implements calci
{
	public int add(int x,int y)
	{
		return x+y;
	}
	public int subtraction(int x,int y)
	{
		return x-y;
	}
	public int multiplication(int x,int y)
	{
		return x*y;
	}
	public int division(int x,int y)
	{
		return x/y;
	}
}
