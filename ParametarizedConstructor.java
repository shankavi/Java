package learn.java;



public class ParametarizedConstructor {
	
	String Animal_name;
	String Animal_type;
	int Animal_age;
	
	ParametarizedConstructor(String name, String type , int age){
		
		Animal_name = name ;
		Animal_type = type;
		Animal_age = age;
		
	}
	
	public void sayAboutAnimal(){
		
		System.out.println("Animal name is : "+ Animal_name +"\nAnimal Type is : "+ Animal_type + "\nAnimal Age is : "+Animal_age + "\n");
	}
//here we can add & create multiple animals using one print statement & variable declaration
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParametarizedConstructor animal1 = new ParametarizedConstructor("Puppy","Dog",4);
		animal1.sayAboutAnimal();
		
		ParametarizedConstructor animal2 = new ParametarizedConstructor("Puzzy","Cat",2);
		animal2.sayAboutAnimal();
	}

}
