package learn.java;

public class ConstructorOverLoading {
//Same constructor object  behave differently base on the situation called as constructor overloading
	
	String Draw;
	//below constructor is default constructor
	ConstructorOverLoading(){
		System.out.println("Default Create Drawing");
	}
	
	//below constructor is overloading constructor
	ConstructorOverLoading(String toDraw){
		System.out.println("Over loading Create Drawing" + toDraw);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverLoading draw = new ConstructorOverLoading();
		ConstructorOverLoading draw1 = new ConstructorOverLoading(" Circle");
		ConstructorOverLoading draw2 = new ConstructorOverLoading();
		ConstructorOverLoading draw3 = new ConstructorOverLoading(" Square");
	}

}
