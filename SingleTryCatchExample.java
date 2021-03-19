package exception_handling;

public class SingleTryCatchExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int number1 = 0;
			int number2 = 3;
			int result = number2/number1;//java.lang.ArithmeticException: / by zero
			
			System.out.println("Print Result :" + result);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("It's a ArithmeticException, we can't devided a number by zero because it's infinitive");
		}

	}

}
