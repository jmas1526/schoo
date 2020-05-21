import java.util.Scanner;

class Q04_19 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int retry;
		do{
			int month;
			do{
				System.out.print("季節を求めます。\n何月ですか：");
				month = keyboardIn.nextInt();
			}while(month < 1 || month > 12);
			
			if(month >= 3 && month <= 5)
				System.out.println("それは春です。");
			else if(month >= 6 && month <= 8)
				System.out.println("それは夏です。");
			else if(month >= 9 && month <= 11)
				System.out.println("それは秋です。");
			else if(month == 12 || month == 1 || month == 2)
				System.out.println("それは冬です。");
			
			System.out.print("もう一度? 1...Yes / 0...N0：");
			retry = keyboardIn.nextInt();
		}while(retry == 1);
	}
}
