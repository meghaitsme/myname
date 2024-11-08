package strings;

public class noofoccurances {

	public static void main(String[] args) {
		
		String s= "I LOVE MY JOB U LOVE ME , I PLACED IN MNC COMPANY ";
		
		int len = s.length();
		System.out.println(len);  // 50 including space 
		
		int removelen = s.replace("M", "").length();
		System.out.println(removelen); // 46 -> remove M -> removed M is 4 , so 4 times M occured.
		
		int count = len - removelen; // 50 -46 = 4 
		
		System.out.println("number of times character occured is: "+count);
		//number of times character occured is: 4
/*
50
46
number of times character occured is: 4
*/
		
	}
}
