package stringFunction;

import java.util.Scanner;

public class Find_Vovels_inthe_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//1. Get the Text from user
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Text : ");
		
		String input = sc.nextLine();
		
	//2. First lets assum the vowel count is 0
		
		int vowelCount = 0;
		
	//3. Change the length to a uniform case
		
		String uniformInput = input.toLowerCase();
		
	//4. take the length of the string
		 
		int length = uniformInput.length();
		
	//5. iterate the characters until the length of string 
	//6. inside the loop, check if the char is any of the vowel charactor. if so, increment, the count by 1
	//7. repeat this until charactors are left	
		
		for(int i = 0; i<length; i++) {
			if(uniformInput.charAt(i)=='a'|| uniformInput.charAt(i)=='e'|| uniformInput.charAt(i)=='i'|| uniformInput.charAt(i)=='o'|| uniformInput.charAt(i)=='u' ) {
				
				vowelCount++;
			}
				
		}
	System.out.println("Your Text has " + vowelCount + " Vovel(s)");	
	
	}

}
