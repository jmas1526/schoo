import java.util.Scanner;
import java.util.Random;

class Exercise7_13{
	
	
	static void printBits(int x){
		for (int i=31;i>=0;i--){
			System.out.print(((x>>>i&1)==1)?"1":"0");
		}
	}
	
	
	static int set(int x,int pos){
		int a=1;
		for(int i=0;i<pos-1;i++){
			a*=2;
		}
		x=a|x;
		return x;
	}
	
	
	static int reset(int x,int pos){
		int a=1;
		for(int i=0;i<pos-1;i++){
			a*=2;
		}
		x=~a&x;
		return x;
	}
	
	
	static int inverse(int x,int pos){
		int a=1;
		for(int i=0;i<pos-1;i++){
			a*=2;
		}
		if((x&a)==0){
			x=x|a;
		}else{
			x=x&~a;
		}
		
		return x;
	}
	
	
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数：");
		int a = stdIn.nextInt();
		System.out.println("2進数表示");
		printBits(a);
		
		System.out.println();
		
		System.out.print("何ビット目：");
		int b = stdIn.nextInt();
		
		int c;
		do{
			System.out.println("どうしますか\n0：1にする\n1：0にする\n2：反転する\n");
			c=stdIn.nextInt();
		}while(c<0||2<c);
		
		
		System.out.println();
		
		if(c==0){
			
			System.out.println("1にした値："+set(a,b));
			System.out.println("1にした値（2進数表示）");
			printBits(set(a,b));
		}else if(c==1){
			System.out.println("0にした値："+reset(a,b));
			System.out.println("0にした値（2進数表示）");
			printBits(reset(a,b));
		}else if(c==2){
			
			System.out.println("反転した値："+inverse(a,b));
			System.out.println("反転した値（2進数表示）");
			printBits(inverse(a,b));
		}
	}
}
