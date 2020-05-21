import java.util.Scanner;
import java.util.Random;

class Q06_14 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("英語の月名を入力してください。\n" + 
			"なお、先頭は大文字で、2文字目以上は小文字とします。\n");

		String[] monthString = {"January","February","March","April","May","June",
			"July","August","September","October","November","December"};
		
		int retry;
		int prevMonth = -1;
		do{
			int month;
			do{
				month = rand.nextInt(12);
			}while(month == prevMonth);
			prevMonth = month;
			String answer;
			while(true){
				System.out.print((month + 1) + "月：");
				answer = keyboardIn.next();
				if (answer.equals(monthString[month])) break;
				System.out.println("違います。");
			}
			
			System.out.print("正解です。もう一度? 1...Yes / 0...No：");
			retry = keyboardIn.nextInt();
		}while(retry == 1);
	}
}
