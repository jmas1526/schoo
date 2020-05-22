import java.util.Scanner;

public class Exercise13_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		HumanPlayer a = new HumanPlayer();
		ComputerPlayer b = new ComputerPlayer();
		
		System.out.println("じゃんけんをします。");
		int flg=0;
		while(true) {
			
			System.out.println();
			
			if(flg==0) {
				System.out.println("最初はグー、じゃんけん…");
			}else {
				System.out.println("あいこで…");
			}
			
			int humanHand = a.createHand();
			int computerHand = b.createHand();
			
			System.out.print("あなた：");
			if(humanHand==0) {
				System.out.println("グー");
			}else if(humanHand==1) {
				System.out.println("チョキ");
			}else if(humanHand==2) {
				System.out.println("パー");
			}
			
			System.out.print("コンピュータ：");
			if(computerHand==0) {
				System.out.println("グー");
			}else if(computerHand==1) {
				System.out.println("チョキ");
			}else if(computerHand==2) {
				System.out.println("パー");
			}
			
			if((humanHand==0 && computerHand==1) || (humanHand==1 && computerHand==2) || (humanHand==2 && computerHand==0)) {
				System.out.println("あなたの勝ちです！");
				System.out.print("もう一度行いますか？1...Yes/2...No：");
				int retry = stdIn.nextInt();
				if(retry==1) {
					flg=0;
					continue;
				}else {
					break;
				}
			}else if((humanHand==0 && computerHand==2) || (humanHand==1 && computerHand==0) || (humanHand==2 && computerHand==1)) {
				System.out.println("あなたの負けです…");
				System.out.print("もう一度行いますか？1...Yes/2...No：");
				int retry = stdIn.nextInt();
				if(retry==1) {
					flg=0;
					continue;
				}else {
					break;
				}
			}else {
				flg=1;
			}
		}

	}

}
