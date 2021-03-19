package exception_handling;

//we can create custamized exception as well

/*Costamized exception story...
 * 	On a fine evening, a guy is giving weird faces to his upset girlfriend when she is at her balconey to make her laugh.-> actual Function
 * her brother noticed this and came to beat him. -> Exception
 * How to handle this exception..?
 * 
 */
public class CostamizeUnchecked_Exception {
	//try  block use to enclose the exception happing situation (exception)
	//catch block use to enclose the preventions activities for the exception (handling exception)(Preventing macanism)
	//a try block can contain multiple catch block as well
	//a catch block must come immediatly followed by try block 

	public void makeGirlfriendLaugh() {
		
		
		try {
			throw new MachanInteruptedException("Machan is coming to hit you !!!");
		}
		
		catch(MachanInteruptedException e){
			//'MachanInteruptedException cannot be resolved to a type' if this error happe must need to declare a MachanInteruptedException
			//class and extented into exception class
			
			e.printStackTrace(); //this method used to print the exception in the console
			
	System.out.println("Your Friend : Machan give this pose da..");
	System.out.println("you: Nanba, greate escape form my GF's brother , thanks da nanba !!!");
	
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CostamizeUnchecked_Exception love = new CostamizeUnchecked_Exception();
		love.makeGirlfriendLaugh();

	}
}
