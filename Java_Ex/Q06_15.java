import java.util.Scanner;
import java.util.Random;

class Q06_15 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("�p��̗j��������͂��Ă��������B\n" + 
			"�Ȃ��A���ׂď������Ƃ��܂��B\n");

		String[] weekEngString = {"sunday","monday","tuesday","wednesday","thursday",
			"friday","saturday"};
		String[] weekJpnString = {"��","��","��","��","��","��",
			"�y"};
		
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
				System.out.print(weekJpnString[week] + "�j���F");
				answer = keyboardIn.next();
				if (answer.equals(weekEngString[week])) break;
				System.out.println("�Ⴂ�܂��B");
			}
			
			System.out.print("�����ł��B������x? 1...Yes / 0...No�F");
			retry = keyboardIn.nextInt();
		}while(retry == 1);
	}
}
