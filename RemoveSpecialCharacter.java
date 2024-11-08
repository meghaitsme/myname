package strings;

//https://www.youtube.com/watch?v=W6rCN8Zcikc&list=PLpLBSl8eY8jQAscb73Z8Auxi3pEWuiUNx&index=4
//Ashok IT  channel 

public class RemoveSpecialCharacter {

	public static void main(String[] args) {

		//1. remove the special character in string 
		String s = "NH4!4&*nbB@9NSG(AnSS)";
		String plainstring = s.replaceAll("[^a-zA-Z0-9]", "");// except this, remove others ^
		System.out.println(plainstring);
		//NH44nbB9NSGAnSS
		
		//2. Remove white space 
		String field = "s bhd s oo   w2 2kwje";
		String replace = field.replaceAll("\\s", "");
		System.out.println(replace); 
		//sbhdsoow22kwje
		//trim() --> truncate the leading and trailing space, but not in between  
		
		
		
		//remove duplicate characters in the string 
		String duplicate = "programming java ";
		
		StringBuilder sb = new StringBuilder();
		
	for(int i=0;i < duplicate.length();i++) {
		char ch = duplicate.charAt(i); //extract 
		int ocuur1st = duplicate.indexOf(ch,i+1 ); // if u take 1 char , check 1st char all other chars 
		//eg , p check with other char , p is present or not .
		if(ocuur1st == -1)  
		{	                 
			sb.append(ch); //if char not available in any other place, then u append char .
		}
		System.out.println(sb); //pormingjva
		
		
	}
	
	
	
	//remove duplicate char from string 
	
	String dup = "Hello my world, i am so lucky i am good to be ";
	
	StringBuilder sbc = new StringBuilder();
	
	for(int i=0; i < dup.length(); i++) {
		char extract = dup.charAt(i);
		int index = dup.indexOf(extract, i+1);
		if(index == -1 ) {
			sbc.append(extract);
		}
		System.out.println(sbc);
	}
	
/*H
H
H
H
H
H
H
H
H
Hw
Hw
Hwr
Hwr
Hwr
Hwr,
Hwr,
Hwr,
Hwr,
Hwr,
Hwr,
Hwr,
Hwr,s
Hwr,s
Hwr,s
Hwr,sl
Hwr,slu
Hwr,sluc
Hwr,sluck
Hwr,slucky
Hwr,slucky
Hwr,sluckyi
Hwr,sluckyi
Hwr,sluckyia
Hwr,sluckyiam
Hwr,sluckyiam
Hwr,sluckyiamg
Hwr,sluckyiamg
Hwr,sluckyiamg
Hwr,sluckyiamgd
Hwr,sluckyiamgd
Hwr,sluckyiamgdt
Hwr,sluckyiamgdto
Hwr,sluckyiamgdto
Hwr,sluckyiamgdtob
Hwr,sluckyiamgdtobe
Hwr,sluckyiamgdtobe
*/
	
	

	String removedc = "Hey remove duplicate charcaters here";
	StringBuilder sbr = new StringBuilder();
	for(int i=0; i < removedc.length();i++) {
		char ch = removedc.charAt(i);
		int indx = removedc.indexOf(ch, i+1);
		if(indx == -1) {
			sbr.append(ch);
		}
		System.out.println("after duplicate char is "+ sbr);
	}
	
	String rsc = "$#%FSVSCD^#HABSFS";
	String plaintext = rsc.replaceAll("[^0-9A-Za-z]", "");
	System.out.println("plaintext is "+ plaintext);
	//plaintext is FSVSCDHABSFS
	
	String wsp = "hello   tobe    goodj   aanu i amhere hope doi ng gud     ";
	String rp = wsp.replaceAll("\\s", "");
	System.out.println("rp is "+ rp);
	//rp is hellotobegoodjaanuiamherehopedoinggud
	
	/*after duplicate char is H
	after duplicate char is H
	after duplicate char is Hy
	after duplicate char is Hy
	after duplicate char is Hy
	after duplicate char is Hy
	after duplicate char is Hym
	after duplicate char is Hymo
	after duplicate char is Hymov
	after duplicate char is Hymov
	after duplicate char is Hymov
	after duplicate char is Hymovd
	after duplicate char is Hymovdu
	after duplicate char is Hymovdup
	after duplicate char is Hymovdupl
	after duplicate char is Hymovdupli
	after duplicate char is Hymovdupli
	after duplicate char is Hymovdupli
	after duplicate char is Hymovdupli
	after duplicate char is Hymovdupli
	after duplicate char is Hymovdupli
	after duplicate char is Hymovdupli
	after duplicate char is Hymovdupli
	after duplicate char is Hymovdupli
	after duplicate char is Hymovdupli
	after duplicate char is Hymovduplic
	after duplicate char is Hymovduplica
	after duplicate char is Hymovduplicat
	after duplicate char is Hymovduplicat
	after duplicate char is Hymovduplicat
	after duplicate char is Hymovduplicats
	after duplicate char is Hymovduplicats 
	after duplicate char is Hymovduplicats h
	after duplicate char is Hymovduplicats h
	after duplicate char is Hymovduplicats hr
	after duplicate char is Hymovduplicats hre  */
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
