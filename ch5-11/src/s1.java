import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
class s1 
{
	public static void main(String[]args)
	{
		System.out.println("請輸入字串");
		try 
		{
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw =new PrintWriter (new BufferedWriter(fw));
			pw.println("hello");
			pw.println("bye");
			pw.close();
			
			
			System.out.println("資料已輸入");
		}
		
	
		catch(IOException e)
		{
			System.out.println("輸入輸出有誤");
		}
		
	}
}