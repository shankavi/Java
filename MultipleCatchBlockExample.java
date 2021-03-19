 package exception_handling;

//Exception id a direct child of throwable and Exception is a parent of compile and run time exception

public class MultipleCatchBlockExample {


	static String Total;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int num1 = 0;
			int num2 = 3;
			int result1 = num2 + num1;
			float result = num2/num1;//java.lang.ArithmeticException: / by zero
			
		
			System.out.println("Print the value of total : "+ Total.lastIndexOf(Total));
			
			System.out.println("Print Result1 :" + result1); 
			
			System.out.println("Print Result :" + result); 
			
			
			
		} catch (ArithmeticException a) {
			//Unreachable catch block for Exception. It is already handled by the catch block for Exception
			// so here i used ArithmeticException , ArithmeticException it's a child class of exception
		
			a.printStackTrace();
			System.out.println("It's a ArithmeticException,");
		}

		
		catch (NullPointerException n) {
			
			//Unreachable catch block for Exception. It is already handled by the catch block for Exception
			// so here i used ArithmeticException , NullPointerException it's a child class of exception
		
			n.printStackTrace();
			System.out.println("Ther is no Value for the variable 'Total' So we can't find the last index of the variable");
		}
		/*Exception e muust write finally because once we write Exception e is a parent so it's handle the all type of exception 
		so no use of rest of the exception , it's prompting the below earror message*/
		//Unreachable catch block for Exception. It is already handled by the catch block for Exception
		
		catch (Exception e) {
				
				// TODO: handle exception
				e.printStackTrace();
				System.out.println(" We can't devided a number by zero because it's infinitive");
		}
	}

}
