package exception_handling;

public class FinalBlock_NotExecuted_Situation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main thread/ main method dead situation final block not execute");
		//System.out.println(2/0); //Main thread/ main method dead situation final block not execute 
		try {
			
			System.out.println("call system.exit method final block not execute");
			System.exit(0);//call system.exit method final block not execute
			
			System.out.println("Dummy method o/p : " + Simple_TryCatchFinal.dummy()); //both static method calling is same
			System.out.println("Inside Try Block");
			System.out.println("After Exception");
			//throw new Exception(); // throwing a explecit exception
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Inside Catch Block");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Inside Final Block");
		//Unrecoverable exception in final block then final block is not execute	
		}
	}

}
