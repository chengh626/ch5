
class s5_5 
{
	public static void main(String[]args)
	{
		try 
		{
		int[] test;
		test = new int [5];
		System.out.println("將值指定給test[10]");
		test[10]=80;
		System.out.println("將80指定給test[10]");
		}
		
	
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("超過陣列範圍");
			System.out.println("發生了"+e+"這個意外");
		}
	finally
	{
	
		System.out.println("一定會執行");
	}
		System.out.println("執行完畢");
	}
}
