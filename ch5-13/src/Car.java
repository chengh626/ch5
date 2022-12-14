import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class s13
{
	public static void main(String[]args)
	{
		if(args.length!=1)
		{
			System.out.println("指定正確檔案");
			System.exit(1);
			
		}
		
		
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
			br.close();
			
		}
		
	
		catch(IOException e)
		{
			System.out.println("輸出錯誤");
			
		}
	}
}
