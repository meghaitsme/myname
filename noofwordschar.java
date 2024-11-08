package strings;

import java.util.Scanner;

import org.testng.annotations.Test;

public class noofwordschar {

	public static void main(String args[]) {
		noofwordschar obj = new noofwordschar();
		obj.countnoofcharacters(); // 1. count with space 2. count without space
		
		obj.countwords();
		
		int noofv = obj.noofvowels();
		System.out.println("number of vowels are" + noofv);
		
		
	}

	void countwords() {
		System.out.println("Enter the string to count words:");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();

		int count = 1;

		for(int i=0; i< str.length()-1; i++)
		{
			if((str.charAt(i) == ' ')   && ( str.charAt(i+1) != ' ')) 
			{
				count++;				
			}
		}

		System.out.println("num of words in sentence is :" + count );

		/* Enter the string :
Enter the string to count words:
i am fantastic
num of words in sentence is :3    */

	}


	void countnoofcharacters() {

		System.out.println("Enter the string to count characters:");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();

		char[] ch = str.toCharArray();
		String s= "";
		for(int i=0; i < ch.length; i++) {
			while(i < ch.length && ch[i] != ' ' ) {
				s = s+ ch[i];
				i++;

			}
			if(i < ch.length) {
				System.out.println("char including space  " + ch.length);
			}
		}


		if(s.length() > 0) {
			System.out.println("number of characters except space  "  + s.length());
		}
		/*Enter the string :
number of characters
char including space  20
char including space  20
number of characters except space  18
		 */
	}


	int noofvowels() {

		System.out.println("Enter the string to count vowels :");
		Scanner read = new Scanner(System.in);
		String st = read.nextLine();
		char[] ch = st.toCharArray();

		int count = 0;
		for(int noofvowels :ch) {
			switch(noofvowels) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				count++;
			}
		}
		return count;
	}
/*
 * 

Enter the string to count vowels :
i answer to the point correctly confidently
number of vowels are12*/























}
