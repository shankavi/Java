package learn.java;


//constructor name must need to same as class name
public class DefaultConstructor {

	String Student;
	int indexno;
	Integer IdNo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// all classes & wrapper class default value is NULL
		//Primitive type default value is zero
		
		DefaultConstructor defaultvalue = new DefaultConstructor();
		System.out.println("Student name (String) default constructor value is :" + defaultvalue.Student);
		System.out.println("Student Index No (int) default constructor value is :" + defaultvalue.indexno);
		System.out.println("Student Id No (integer wrapper class) default constructor value is :" + defaultvalue.IdNo);
		
	}
 
}
