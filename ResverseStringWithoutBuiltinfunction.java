package strings;

public class ResverseStringWithoutBuiltinfunction {
	//get the input from user 
	public static void main(String[] args) {
		String br = "Software testing help";
		String ar = "";

		for(int i=0; i < br.length(); i++)
		{
			ar = br.charAt(i) + ar;

		}
		System.out.println(ar); //muineles avaj noitamotuA
		//pleh gnitset erawtfoS
		//********************* Reverse number *****************

		int on = 23456;
		int rn = 0;

		while(on != 0) 
		{
			rn = (rn*10) + (on%10);  // 23456%10 = 6  // 65  //654 //6543
			on = on/10; // 23456/10 = 2345
		}

		System.out.println(rn);





		// swap 2 number , using 3rd variable 
		int a= 10, b= 20, c;

		c = a;
		a=b;
		b=c;
		System.out.println(a + "a value "  + "b value is " +b);

		//without using 3rd variable 
		System.out.println(a+ "" + b); //before swapping  20 10 
		a = a+b;
		b= a-b;
		a= a-b;
		System.out.println(a + "" + b);// after swapping  10 20 

	}

}
