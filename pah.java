package strings;

public class pah {
	public static void main(String[] args){
		
		//1. 
		String get = "Output Like This ";
		
		for(char ch :get.toCharArray()) {
			System.out.print(ch + "-");
			//O-u-t-p-u-t- -L-i-k-e- -T-h-i-s- -
		}
		//=============================================================================================
		
		
		String ul = "BGSCfsvcsgGS ABSVS";
		int ucount=0;
		int lcount=0;
		for(int i=0; i < ul.length(); i++)
		{
			char index = ul.charAt(i);
			if(index > 'A' && index < 'Z') {
				ucount++;
			} else if (index > 'a' && index < 'z') {
				lcount++;
			}
			 
		}
		
		if(ucount > 0) {
			System.out.println("upper count is "+ ucount); // 10
		} 
		if(lcount > 0) {
			System.out.println("lcount is " + lcount); // 6 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 String str = "AGSVFDCFVCfagavsdsvd";
		 int Lcount = 0;
		 int Ucount = 0;
		 
		 for(int i=0; i < str.length(); i++){
		 char ch = str.charAt(i);
		 if(ch >= 'A' && ch <='Z'){
		 Lcount++;
		
		 } else if(ch >='a' && ch <='z'){
		 
		 Ucount++;
		
		 }
		 
		 System.out.println("lower count "+ Lcount);
		 System.out.println("upper count "+ Ucount);
		 
		 
		 }


	}
	}
