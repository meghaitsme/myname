package strings;

import org.testng.annotations.Test;

public  class Compare2Strings {


	@Test
	void Compare(){
		compareString();
	}

	
	public void compareString() {
		String s1 = "Megha ";
		String s2 = "megha ";
		boolean compare = false;

		for(int i=0; i< s1.length() ; i++) {
			if(s1.charAt(i) == s2.charAt(i)) {
				System.out.println("Strings are same ");
			}	
		}
		
	}

}
