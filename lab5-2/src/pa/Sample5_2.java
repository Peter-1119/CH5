package pa;

public class Sample5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] test;
			test = new int[5];
			
			System.out.println("將值指定給test[10]");
			
			test[10] = 80;
			System.out.println("將80指定給test[10]");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("超過陣列範圍了");
		}
		System.out.println("順利地執行完畢");
	}

}
