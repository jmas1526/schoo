import java.util.Scanner;
public class Q15_5_r1 {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);

		HumanPlayer_r1 human = new HumanPlayer_r1("player");
		ComputerPlayer_r1 com1 = new ComputerPlayer_r1("COM1");
		ComputerPlayer_r1 com2 = new ComputerPlayer_r1("COM2");


		boolean retry = false;
		do {
			try {
				play3(human,com1,com2);
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println(e);
				break;
			}
			
			System.out.print("retry? Y...1 / N...0(もしくは1以外)：");
			try {
				retry = keyboardIn.next().equals("1");				
			} catch (Exception e){
				System.out.println("エラー発生： " + e);
				System.out.println("終了します");
				break;
			}
			System.out.println();
		} while (retry);
		keyboardIn.close();

	}

	static void play3(RSP_Player_r1 a, RSP_Player_r1 b, RSP_Player_r1 c) {

		
		int handA, handB, handC;
		RSP_Player_r1.Result resultA, resultB, resultC;
		handA = a.chooseHand();
		handB = b.chooseHand();
		handC = c.chooseHand();
		
//		System.out.println(a.getPlayerName() + "：" + a.getHand(handA));
//		System.out.println(b.getPlayerName() + "：" + b.getHand(handB));
//		System.out.println(c.getPlayerName() + "：" + c.getHand(handC));
		
		
		switch (RSP_Player_r1.play(handA, handB)) {
		case 0://aとbはあいこ
			switch (RSP_Player_r1.play(handA, handC)) {
			case 0:
				resultA = RSP_Player_r1.Result.draw;
				resultB = RSP_Player_r1.Result.draw;
				resultC = RSP_Player_r1.Result.draw;
				break;
			case -1:
				resultA = RSP_Player_r1.Result.lose;
				resultB = RSP_Player_r1.Result.lose;
				resultC = RSP_Player_r1.Result.win;
				break;
			case 1:
				resultA = RSP_Player_r1.Result.win;
				resultB = RSP_Player_r1.Result.win;
				resultC = RSP_Player_r1.Result.lose;
				break;
			default://エラー
				throw new RuntimeException("playエラー");
			}
			break;
		case -1://aとbではbの勝ち
			switch (RSP_Player_r1.play(handA, handC)) {
			case 0:
				resultA = RSP_Player_r1.Result.lose;
				resultB = RSP_Player_r1.Result.win;
				resultC = RSP_Player_r1.Result.lose;
				break;
			case -1:
				resultA = RSP_Player_r1.Result.lose;
				resultB = RSP_Player_r1.Result.win;
				resultC = RSP_Player_r1.Result.win;
				break;
			case 1:
				resultA = RSP_Player_r1.Result.draw;
				resultB = RSP_Player_r1.Result.draw;
				resultC = RSP_Player_r1.Result.draw;
				break;
			default://エラー
				throw new RuntimeException("playエラー");
			}
			break;
		case 1://aとbではaの勝ち
			switch (RSP_Player_r1.play(handA, handC)) {
			case 0:
				resultA = RSP_Player_r1.Result.win;
				resultB = RSP_Player_r1.Result.lose;
				resultC = RSP_Player_r1.Result.win;
				break;
			case -1:
				resultA = RSP_Player_r1.Result.draw;
				resultB = RSP_Player_r1.Result.draw;
				resultC = RSP_Player_r1.Result.draw;
				break;
			case 1:
				resultA = RSP_Player_r1.Result.win;
				resultB = RSP_Player_r1.Result.lose;
				resultC = RSP_Player_r1.Result.lose;
				break;
			default://エラー
				throw new RuntimeException("playエラー");
			}
			break;
		default://エラー
			throw new RuntimeException("playエラー");

		}
		System.out.println("==結果==");
		System.out.println(a.getPlayerName() + "：" + resultA.getLabel());
		System.out.println(b.getPlayerName() + "：" + resultB.getLabel());
		System.out.println(c.getPlayerName() + "：" + resultC.getLabel());
	}



}
