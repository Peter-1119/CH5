package pa;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;
public class Sample5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1)
		{
			System.out.println("�Ы��w���T���ɮצW��");
			System.exit(1);
		}
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			
			String str;
			while((str = br.readLine()) != null)
			{
				System.out.println(str);
			}
			
			br.close();
		}
		
		catch(IOException e)
		{
			System.out.println("��X�J���~");
		}
	}
}