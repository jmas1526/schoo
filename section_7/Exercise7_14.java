import java.util.Scanner;
import java.util.Random;

class Exercise7_14{
	
	
	static void printBits(int x){
		for (int i=31;i>=0;i--){
			System.out.print(((x>>>i&1)==1)?"1":"0");
		}
	}
	
	
	static int setN(int x,int pos){
		x=x|1;
		int a=1;
		for(int i=0;i<pos-1;i++){
			a*=2;
			
			x=a|x;
		}
		
		return x;
	}
	
	
	static int resetN(int x,int pos){
		x=~1&x;
		int a=1;
		for(int i=0;i<pos-1;i++){
			a*=2;
			
			x=~a&x;
		}
		
		return x;
	}
	
	
	static int inverseN(int x,int pos){
		if((x&1)==0){
			x=x|1;
		}else{
			x=x&~1;
		}
		
		int a=1;
		for(int i=0;i<pos-1;i++){
			a*=2;
			if((x&a)==0){
				x=x|a;
			}else{
				x=x&~a;
			}
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
		
		System.out.print("何ビットまで：");
		int b = stdIn.nextInt();
		
		int c;
		do{
			System.out.println("どうしますか\n0：1にする\n1：0にする\n2：反転する\n");
			c=stdIn.nextInt();
		}while(c<0||2<c);
		
		
		System.out.println();
		
		if(c==0){
			
			System.out.println("1にした値："+setN(a,b));
			System.out.println("1にした値（2進数表示）");
			printBits(setN(a,b));
		}else if(c==1){
			System.out.println("0にした値："+resetN(a,b));
			System.out.println("0にした値（2進数表示）");
			printBits(resetN(a,b));
		}else if(c==2){
			
			System.out.println("反転した値："+inverseN(a,b));
			System.out.println("反転した値（2進数表示）");
			printBits(inverseN(a,b));
		}
	}
}
