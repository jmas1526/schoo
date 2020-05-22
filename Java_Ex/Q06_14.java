import java.util.Scanner;
import java.util.Random;

class Q06_14 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("�p��̌�������͂��Ă��������B\n" + 
			"�Ȃ��A�擪�͑啶���ŁA2�����ڈȏ�͏������Ƃ��܂��B\n");

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
				System.out.print((month + 1) + "���F");
				answer = keyboardIn.next();
				if (answer.equals(monthString[month])) break;
				System.out.println("�Ⴂ�܂��B");
			}
			
			System.out.print("�����ł��B������x? 1...Yes / 0...No�F");
			retry = keyboardIn.nextInt();
		}while(retry == 1);
	}
}
