import java.util.Scanner;

class Exercise4_19{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int retry;
		int n;
		
		do{
			do{
				System.out.print("季節を求めます。\n何月ですか：");
				n=stdIn.nextInt();
			}while(n<1 || n>12);
			if(n>=3&&n<=5){
				System.out.println("それは春です。");
			}
			if(n>=6&&n<=8){
				System.out.println("それは夏です。");
			}
			if(n>=9&&n<=11){
				System.out.println("それは秋です。");
			}
			if(n==12||n==1||n==2){
				System.out.println("それは冬です。");
			}
			System.out.print("もう一度？　1…Yes/0…No");
			retry=stdIn.nextInt();
		}while (retry==1);
	}
}
