import java.util.*;

public class a2q3 {

	public static int frequency(String s){
		
		int freq[]=new int[s.length()];
		
		for(int x=0; x<s.length(); x++ ){

			freq[x]=0;
		}
		
		for(int i=0; i<s.length(); i++){
			
			char c1=s.charAt(i);
			
			for(int j=i; j<s.length(); j++){
				
				char c2=s.charAt(j);
				
				if(c1==c2){
					
					freq[i]++;
				}
			}
		}
		
		int max=0;
		
		for(int x=0; x<s.length(); x++ ){

			max=freq[max]>freq[x]?max:x;
		}
		return max;
				
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		int x=frequency(s);
		
		System.out.println("Char with the highest fequency: "+s.charAt(x));

		sc.close();
	}

}