package pc;

public class Car 
{
	private int num;
	private double gas;
	
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("以生產車子");
		
	}
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("車號設為"+num+"汽油輛設為"+gas);
		
	}
	public void show()
	{
		System.out.println("車號設為"+num);
		System.out.println("汽油輛設為"+gas);
	}

}
