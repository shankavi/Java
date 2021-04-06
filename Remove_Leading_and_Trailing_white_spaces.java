package stringFunction;

import java.util.Scanner;

public class Remove_Leading_and_Trailing_white_spaces {

	public void Remove_WhiteSpaces_Using_trim() {
		//trim()
		String input = "    Hi Please Remove My Front and Back Spaces using trim()      ";
		System.out.println("After Remove white Spaces : " + input.trim());
	}
	
	public void Remove_WhiteSpaces_Using_Strip() {
		
		String input = "    Hi Please Remove My Front and Back Spaces     ";
		//1.strip()
		System.out.println("After Remove white Spaces strip() : " + input.strip());
		
		//2.stripLeading()
		System.out.println("After Remove white Spaces stripLeading() : " + input.stripLeading());
		
		//3.stripTrailing()
		System.out.println("After Remove white Spaces stripTrailing() : " + input.stripTrailing());
	}

	public void Remove_WhiteSpaces_Using_regex() {
	//using Regular Expressions
		
		String input = "    Hi Please Remove My Front and Back Spaces     ";
		//1.^[ \t] + | [ \t] + $ -> leading(front Space) and trailing(back Space)
		System.out.println("After Remove white Spaces ^[ \\t] + | [ \\t] + $ -> leading and trailing : " + input.replaceAll("^[ \\t] + | [ \\t] + $", ""));
		
		//2. ^[ \t] + -> leading
		
		System.out.println("After Remove white Spaces ^[ \\t] + -> leading : " + input.replaceAll("^[ \\t] +", ""));
		//3. [ \t] + $ -> trailing
		
		System.out.println("After Remove white Spaces [ \\t] + $ -> trailing : " + input.replaceAll("[ \\t] + $", ""));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Remove_Leading_and_Trailing_white_spaces whiteSpace = new Remove_Leading_and_Trailing_white_spaces();
		whiteSpace.Remove_WhiteSpaces_Using_trim();
		
		whiteSpace.Remove_WhiteSpaces_Using_Strip(); 
		
		whiteSpace.Remove_WhiteSpaces_Using_regex();
	}

}
