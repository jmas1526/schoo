import java.util.Scanner;
import java.util.Random;

class Exercise7_15{
	
	
	static int sumOf(int []a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	}
	
	public static void main(String[]args){
		
			System.out.print(sumOf(new int[]{1,2,3}));
	}
}
