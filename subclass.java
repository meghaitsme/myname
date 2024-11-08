package strings;

import java.util.Scanner;

import org.testng.annotations.Test;

public class subclass {
	@Test
	void noofvowelsinstring() {
		System.out.println("enter the string for vowels:");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine(); //I enjoy every moment with blessed.
		char[] ch = str.toCharArray();

		int count = 0;
		for(int noofvowe :ch) {
			switch(noofvowe) {

			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				count++;
				break;
			}
		}
		System.out.println("vowels are "+ count); //vowels are 9
	}

	@Test
	void noofcharactersinstring(){
		System.out.println("enter the string to count number of characters");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();// I am in the fantasy world 
		char[] ch = str.toCharArray(); 
		String s= "";

		for(int i=0; i < ch.length; i++) {
			while(i < ch.length && ch[i] != ' ') {
				s = s+ ch[i];
				i++;
			}
		}
		int countch = s.length(); 
		System.out.println("number of characters except space " + countch);
		//number of characters except space 20

		int countchwithspace = ch.length;
		System.out.println("number of characters "+ countchwithspace );
		//number of characters 26
	}
	
	@Test
	void noofwords() {
		System.out.println("enter string");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		int count = 1;
		
		for(int i=0; i < str.length(); i++) {
			if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' ')) {
				count++;
			}
		}
		System.out.println("number of words " + count);
	}
	
	
	
	@Test
	void occurance() {
		String str = "I live in fantasy world, You are my strength , and you are my weakness";
		int strlen = str.length();
		int strlenafterremove = str.replace("i", "").length();
		int diff = strlen - strlenafterremove;
		System.out.println("number of times occurance is " + diff);
	}
	
	@Test
	void reverseString() {
		String str = "I live in fantasy world, You are my strength , and you are my weakness";
		String s ="";
		
		for(int i= 0; i < str.length(); i++) {
			s = str.charAt(i) + s ;
		}
		System.out.println("reveresed string is :" + s);
		//reveresed string is: ssenkaew ym era uoy dna , htgnerts ym era uoY ,dlrow ysatnaf ni evil I
	}
	
	
	
	
}
