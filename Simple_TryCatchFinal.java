package exception_handling;

public class Simple_TryCatchFinal {
	
	public static int dummy() {
		return 3;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//System.out.println(2/0); //unchecked exception
			System.out.println("Dummy method o/p : " + dummy());//both static method calling is same
			System.out.println("Dummy method o/p : " + Simple_TryCatchFinal.dummy()); //both static method calling is same
			System.out.println("Inside Try Block");
			System.out.println("After Exception");
			throw new Exception(); // throwing a explecit exception
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Inside Catch Block");
		}
		
		finally {
			System.out.println("Inside Final Block");
			System.out.println("There is no finally block if try catch blocks are not there");
			System.out.println("Final block execute even if the try block contains contral transfer statements like return, break or continue");
		}
	}

}
