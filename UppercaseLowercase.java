package strings;

public class UppercaseLowercase {

	public static void main(String[] args) {
String str = "ADCSGSvfsscdeGSCSF";
int Lcase = 0;
int Ucase = 0;

for(int i=0; i < str.length(); i++) {
	char ch = str.charAt(i);
	
	if(ch >= 'a' && ch <= 'z') {
		Lcase++;
		System.out.println("count of Lowercase"+Lcase);
	}
	
	if(ch >= 'A' && ch <= 'Z') {
		Ucase++;
		System.out.println("count of Uppercase"+Ucase);
	}
}
	}

}
