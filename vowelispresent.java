package strings;

public class vowelispresent {
	
static	String str = "Welcome";
	
static boolean vowelpresent() {
	for(int i=0; i <= str.length(); i++) {
		char ch = str.charAt(i);
		System.out.println(ch);
		switch(ch) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		 return true;
}
	}
	return false;
}
	public static void main(String[] args) {

		boolean result = vowelpresent();
		System.out.println(result);
		
}
}