import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException;
import java.io.PrintWriter; 

public class test_p40 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length!=1)
		{
			System.out.println("請輸入正確的膽案名稱");
			System.exit(1);
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			String str;
			
			while((str = br.readLine()) != null)
			{
				System.out.println(str);
			}		
			br.close();
		}
		catch(IOException e) {
			System.out.println("輸出入錯誤");
		}
	}

}
