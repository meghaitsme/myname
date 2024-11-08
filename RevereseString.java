package strings;

import java.util.Scanner;

import org.testng.annotations.Test;

public class RevereseString {
	// Sandy -> ydnaS

	@Test
	public void ReverseString() {
		System.out.println("Enter the String to reverse  : ");
		Scanner read = new Scanner(System.in);
		String str =  read.nextLine(); //BeforeReverse 
		String afterreverse = "";

		//Logic 
		for(int i=0; i < str.length() ; i++) {
			afterreverse = str.charAt(i) + afterreverse;
		}

		System.out.println("After reverse :     "+ afterreverse);	
	}	
	
	
	/* 
Enter the String to reverse  : 
I am in India
After reverse :     aidnI ni ma I
PASSED: ReverseString    */

}
