package learn.java;
//constructor name must need to same as class name

public class NoArguementConstructor {
	//NoArguementConstructor also called as non parameter constructor
	
	String Student; // if wish we can create variables
	int indexno;
	
	
	//define a NoArguementConstructor
	NoArguementConstructor(){
		
		Student = "Shankavi";
		
		indexno = 12345;
		
		System.out.println("No Arguement Constructor is created sucessfully \n" +Student + "\t" +indexno);
	}
	
	//once we create a constructor the we override our default constructor
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoArguementConstructor nrc = new NoArguementConstructor();
		//no parameters pass here
	}

}
