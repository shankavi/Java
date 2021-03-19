package exception_handling;

public class CheckedExceptionExample {
/* Exception which are indicated during the compile time are known as 
 * 'Checked Exception' or 'Compile Time Exception' 
 */
	
	String name = "Checked Exception";
	
	static String name1 = "need to change non static method to static method to resolve the above exception issue";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(name); //Cannot make a static reference to the non-static field name
		
		/*public class CheckedExceptionExample {
		static /* Exception which are indicated during the compile time are known as 
		 * 'Checked Exception' or 'Compile Time Exception' 
		...*/
		
		System.out.println(name1);
	}

}
