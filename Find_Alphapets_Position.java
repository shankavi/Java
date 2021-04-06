package array_Functions;

import java.util.Scanner;

public class Find_Alphapets_Position {
	
	//To find the position of the given English alphabets
	
	//ASCII => 97 ->a, 65 -> A
	
	public void Alphabet_convert_to_UpperCase() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Charactor : ");
		
		char givenChar = sc.next().charAt(0);
		//sc.close();
		char UpperCaseChar = Character.toUpperCase(givenChar);
		
		int asciiValue = (int)UpperCaseChar;
		
		int 	position1 = asciiValue-64;//because ASCII => 97 ->a, 65 -> A
		
		System.out.println(givenChar + " (UpperCaseChar) Position in the English Alphabet is : " + position1);
		System.out.println(givenChar + " Charactor ASCII value is : " + asciiValue);
	}
	
public void Alphabet_convert_to_LowerCase() {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter Your Charactor : ");
		
		char givenChar1 = sc1.next().charAt(0);
		//sc1.close();
		//convert all charactors in to lowercase
				//Charactor is a default class in java
				
		char LowerCaseChar = Character.toLowerCase(givenChar1);
		
		int asciiValue1 = (int)LowerCaseChar;
		
		int 	position = asciiValue1-96;//because ASCII => 97 ->a, 65 -> A
		
		System.out.println(givenChar1 + " (LowerCaseChar) Position in the English Alphabet is : " + position);
		System.out.println(givenChar1 + " Charactor ASCII value is : " + asciiValue1);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Find_Alphapets_Position alphabet = new Find_Alphapets_Position();
		alphabet.Alphabet_convert_to_LowerCase();
		alphabet.Alphabet_convert_to_UpperCase();
		
		
	}

}
