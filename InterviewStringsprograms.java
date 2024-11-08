package strings;

public class InterviewStringsprograms {

	public static void main(String[] args) {
	//1. get o-u-t-p-u-t like this format 	
		String str = "output like this ";
		
		//1. convet str to char 
		for(char ch : str.toCharArray()) {
		 System.out.print(ch +"-");	
		 //o-u-t-p-u-t- -l-i-k-e- -t-h-i-s- -
		}
		
	//2. 	 
		int i = 20; //primitive datatype  to wrapper class -> use valueof()
		//int to string 
		String value = String.valueOf(20); 
		System.out.println(value ); // 20
		
		
	//2. widenning -> int to long  lower -> to higher 
	 int  w = 20;
	 long l = w;  // widening => 20
	 System.out.println(l);
	 
	 // 2. naroowing :- 
	 double d = 20.43;
	 long dl = (long)d;
	 System.out.println(dl); // 20 -> decimal value is truncated 
	 
	 //3. 
	System.out.println( String.valueOf(i)); //20
	System.out.println( Integer.parseInt("10")); // number formatexception "w" , 10 
	System.out.println( Double.parseDouble("20.98")); // 20.98
	
	
	//4. 
	String s = 3 + "str" + 3; // 3str3
	String s1 = 3 + 3 + "str"; //6str
	String s2 = "3" + 3 + "str"; //33str
	String s3 = "3" + "3" + "23";//3323
	String s4 = "" + 3 + 3 + "23"; //  since it is string it doesnot add , 3323
	String  s5 =3 + 3 + 23+"";  // 29        //String :-change to int -> compile error
	 System.out.println(s);
	 System.out.println(s1);
	 System.out.println(s2);
	 System.out.println(s3);
	 System.out.println(s4);
	 System.out.println(s5);
	 
	 
	 //5.
	 String v = "abcde"; // 0 1 2 3 4 
	System.out.println( v.charAt(2)); // c
	System.out.println( v.length()); //5
	System.out.println( v.indexOf(i)); //-1
	System.out.println( v.toString()); // abcde
	System.out.println( v.substring(0,3));// start, end --> abc
	System.out.println( v.substring(1)); // start except 1 , print others --> bcde 
	System.out.println(v.contains("c")); //true
	System.out.println( v.endsWith("e")); //true
	System.out.println(v.startsWith("a")); //true 
	 
	 
	 
	 
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
