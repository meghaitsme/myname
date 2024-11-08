package strings;

import java.util.Scanner;

import org.testng.annotations.Test;// dont apply test for actionmethods , only for main, where u invoke the 
//method 

public class noofcharactersnoofvowels {

@Test
	void noofvowels() {
		System.out.println("enter the string");
		Scanner read = new Scanner(System.in);
		String st = read.nextLine();

		char[] ch = st.toCharArray();

		int count = 0;
		for(int noofvowelsinstrng :ch) {
			switch(noofvowelsinstrng){
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				count++;
				break;
			}
		}

		System.out.println("number of vowels in string " + count);
	}






	@Test
	void noofCharacters() {
		
		noofcharactersnoofvowels obj = new noofcharactersnoofvowels();

		System.out.println("Enter the string");
		Scanner read = new Scanner(System.in);
		String st = read.nextLine();

		char[] ch = st.toCharArray();
		obj.concatthestring(ch);

	}

	void concatthestring(char[] ch) 
	{
		String s= "";
		for(int i=0; i < ch.length; i++) {


			while(i < ch.length && ch[i] == ' ' )
			{
				s= s+ ch[i];
				i++;
			}
			
			if(ch.length > 0) {
				System.out.println(" number of characters " + ch.length); // including space it counts 
			}
			
			System.out.println(s.length()); // total number of words is 2 ( 0 1 2 ) 
		}
		
	}
	

}// main class 