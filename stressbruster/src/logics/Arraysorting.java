package logics;

public class Arraysorting {

	public static void main(String[] args) {
		String given= "mnbvcxzlkjhgfdsapoiuytrewqafrtyijhgggmnbvcxzASDFGHJKLKJHGFDSAqwertyuiop";
		char[] input=given.toCharArray();
		int j=input.length;
while (j>1) {
	for (int i = 0; i < input.length - 1; i++) {
		//int a1=0;
		char a2 = input[i];
		char a3 = input[i + 1];

		if (input[i] >= input[i + 1]) {
			input[i] = a3;
			input[i + 1] = a2;
		}
	} 
	j--;
}
for(char k:input) {
	System.out.println(k);
}
	}

}
