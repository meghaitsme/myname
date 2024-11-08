package strings;

import java.util.Scanner;

public class noofvowelsinstring {

	public static void main(String[] args) {
		
  //input from user 
		System.out.println("enter the string ");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine(); 
		
//convert string to char 
		char[] tochar = str.toCharArray();

// count vowels 		
		int count = 0;
		for(int noofvowels :tochar) {
			switch(noofvowels) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' :
				count++;
				break;
			}
		}
		System.out.println("number of vowels " + count);	
	}
//	enter the string 
//	Number of vowels here are
//	number of vowels 9
}
