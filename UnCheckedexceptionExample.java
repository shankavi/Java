package exception_handling;

public class UnCheckedexceptionExample {
/*Exception which will happen during the execution of the program are
 * Un Checked or Run Time Exception
 */
	
	static String name; //here we are not assign value for 'name' variable so the default value is null
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Variable Value : " +name);//default value null 
		System.out.println("Length of the variable : " +name.length());//null value not having length (NullPointerException)
		
		/*Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "exception_handling.UnCheckedexceptionExample.name" is null
	at exception_handling.UnCheckedexceptionExample.main(UnCheckedexceptionExample.java:14)*/
	}

}
