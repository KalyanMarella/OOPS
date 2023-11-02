class Monster
{
	public void Attack()
	{
		System.out.println("Super_Monster");
	}
}
class Fire extends Monster
{
	public void Attack()
	{
		System.out.println("Fire_Monster");
	}
}
class Water extends Monster
{
	public void Attack()
	{
		System.out.println("Water_Monster");
	}
}
class Stone extends Monster
{
	public void Attack()
	{
		System.out.println("Stone_Monster");
	}
}
class lab43
{
	static void doAttack(Monster m)
	{
		m.Attack();
	}
	public static void main(String[] args)
	{
		Fire f=new Fire();
		Water w=new Water();
		Stone s=new Stone();
		doAttack(f);
		doAttack(w);
		doAttack(s);
	}
}
