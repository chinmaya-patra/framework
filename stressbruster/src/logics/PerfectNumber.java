package logics;

public class PerfectNumber {

	public static void main(String[] args) {
	//int input=6;
	
	for(int i=2;i<=10000;i++) {
		
		int count=0;
		
		for(int j=1;j<=i/2;j++) {
			//System.out.println(flag);
			if(i%j==0) {
				count=count+j;
			}
			//System.out.println(count);
			
			
		}
		if(i==count) {
			System.out.println(i +" is a perfect number.");
		}

		}
		
		
	}
	
	
	
	
	
	
	

}
