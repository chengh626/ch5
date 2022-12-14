
class s464
{
	public static void main(String[]args)
	{
		
		Company cmp = new Company();
		
		Driver dv1 = new Driver(cmp);
		dv1.start();
		
		Driver dv2 = new Driver(cmp);
		dv2.start();

	}
}
class Company
{
	private int sum =0;

	public  void add(int a)
	{
		int tmp = sum;
		System.out.println("目前金額"+tmp+"元");
		System.out.println("鑽到"+a+"元");
		tmp = tmp +a;
		System.out.println("合計金額"+tmp+"元");
	    sum = tmp;
	
	}
}
class Driver extends Thread
{
	private Company comp;
	public Driver(Company c)
	{
		comp =c;
	}
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			comp.add(50);
		}
		
	}

}
