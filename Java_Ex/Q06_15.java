import java.util.Scanner;
import java.util.Random;

class Q06_15 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("英語の曜日名を入力してください。\n" + 
			"なお、すべて小文字とします。\n");

		String[] weekEngString = {"sunday","monday","tuesday","wednesday","thursday",
			"friday","saturday"};
		String[] weekJpnString = {"日","月","火","水","木","金",
			"土"};
		
		int retry;
		int prevWeek = -1;
		do{
			int week;
			do{
				week = rand.nextInt(7);
			}while(week == prevWeek);
			prevWeek = week;
			String answer;
			while(true){
				System.out.print(weekJpnString[week] + "曜日：");
				answer = keyboardIn.next();
				if (answer.equals(weekEngString[week])) break;
				System.out.println("違います。");
			}
			
			System.out.print("正解です。もう一度? 1...Yes / 0...No：");
			retry = keyboardIn.nextInt();
		}while(retry == 1);
	}
}
