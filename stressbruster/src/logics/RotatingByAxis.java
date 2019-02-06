package logics;

public class RotatingByAxis {

	public static void main(String[] args) {
	String s="India is a developing country ! which need to be developed";
	String[] arr=s.split(" ");
	int size=arr.length;
	for(int i=0;i<=arr.length/2;i++) {
		String flag=arr[i];
		arr[i]=arr[size-(i+1)];
		arr[size-(i+1)]=flag;
		
	}
for(String s2:arr) {
	System.out.print(s2+" ");
}
	}

}
