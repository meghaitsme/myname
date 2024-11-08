package strings;

import java.util.Scanner;

import org.testng.annotations.Test;

public class noofcharacters {
	
	@Test
	public void words() {
		System.out.println("enter the string ");
		Scanner read = new Scanner(System.in);
		String st = read.nextLine();
		
		
		char[] ch = st.toCharArray(); // convet String to char 
		
		//concatinate the alphabets , 
		//when it reaches to spaces , comes out of while loop 
		String s= ""; //to print output 
		
		
		for(int i=0; i < ch.length ; i++) {
			//concatinate the characters until it reaches to space .
			while(i < ch.length && ch[i] != ' ') {
				s = s+ ch[i];  
				i++;
				
			}	
		}	
			if(s.length() > 0) {
				System.out.println("length of word is " + s.length());  //concatinate strings    11  7 
			} // length of each word 
	
		if(ch.length > 0) {
			System.out.println(" number of characters " + ch.length);
			//total no of characters including space  
		}
		
		/*enter the string 
hello ia m in this world
length of word is 5
 number of characters 24
length of word is 2
 number of characters 24
length of word is 1
 number of characters 24
length of word is 2
 number of characters 24
length of word is 4
 number of characters 24
length of word is 5
 number of characters 24
PASSED: words
		 * */
		
	}
	
	
	
	

}
