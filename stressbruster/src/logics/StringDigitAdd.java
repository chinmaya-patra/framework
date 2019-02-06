package logics;

public class StringDigitAdd {
	
	
	public static boolean isNumeric(String strNum) {
	    try {
	        int i1 = Integer.parseInt(strNum);
	    } catch (NumberFormatException | NullPointerException nfe) {
	        return false;
	    }
	    return true;
	}
	

	public static void main(String[] args) {
		int count1=0;
		int count2=0;
		
		String input="601patra40kumar70sabha121";
		char[] arr1=input.toCharArray();
		for(int i=0;i<=arr1.length-1;i++) {
			if(Character.isDigit(arr1[i])) {
				count1=count1*10+Character.getNumericValue(arr1[i]);
			}
				
				
			
			else {
				count2=count2+count1;
				count1=0;
			}
		}
		
		
		System.out.println(count2+count1);
		
		
		
		int i1=30;
		System.out.println(Integer.toBinaryString(i1)+10);
		int i2=123456789;
		System.out.println(Integer.rotateLeft(i2, 1));
		
		
		
		
	}

}
