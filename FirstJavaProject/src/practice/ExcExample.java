package practice;

public class ExcExample {
	
	public static void main(String[] args) throws Exception {
		
		
		String str=null;

		
		Thread.sleep(5000);
	
		
		try {
		System.out.println(str.length());
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		finally {
		System.out.println("I am last line");
		}
		
	}

}
