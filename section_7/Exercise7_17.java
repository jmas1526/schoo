import java.util.Scanner;
import java.util.Random;

class Exercise7_17{
	
	
	static int linearSearchR(int []a,int key){
		
		for(int i=(a.length-1);i>0;i--){
			if(a[i]==key){
				return i;
			}
			
		}
		return -1;
	}
	
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("key：");
		int key=stdIn.nextInt();
		
		int idx=linearSearchR(new int[]{2,3,5,6,8,2,3,1,2,3},key);
		
			if(idx==-1){
				System.out.println("その値の要素は存在しません。");
			}else{
				System.out.println("その値は要素番号"+idx+"にあります。");
			}
	}
}
