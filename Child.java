package learn.java;

//constructors does not contain final ,abstract, static , syncronized but can contain access modifiers

// before extend parent class child class o/p is "I'm Child" but after parent class extende o/p is "I'm Parent" "I'm Child"
public class Child extends Parent{
	
	public Child(){
	//if we use extend key words that time super method is created silently	
		
		System.out.println("I'm Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child = new Child();
	
		
	}

}
