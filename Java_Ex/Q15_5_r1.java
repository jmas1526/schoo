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
			
			System.out.print("retry? Y...1 / N...0(��������1�ȊO)�F");
			try {
				retry = keyboardIn.next().equals("1");				
			} catch (Exception e){
				System.out.println("�G���[�����F " + e);
				System.out.println("�I�����܂�");
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
		
//		System.out.println(a.getPlayerName() + "�F" + a.getHand(handA));
//		System.out.println(b.getPlayerName() + "�F" + b.getHand(handB));
//		System.out.println(c.getPlayerName() + "�F" + c.getHand(handC));
		
		
		switch (RSP_Player_r1.play(handA, handB)) {
		case 0://a��b�͂�����
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
			default://�G���[
				throw new RuntimeException("play�G���[");
			}
			break;
		case -1://a��b�ł�b�̏���
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
			default://�G���[
				throw new RuntimeException("play�G���[");
			}
			break;
		case 1://a��b�ł�a�̏���
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
			default://�G���[
				throw new RuntimeException("play�G���[");
			}
			break;
		default://�G���[
			throw new RuntimeException("play�G���[");

		}
		System.out.println("==����==");
		System.out.println(a.getPlayerName() + "�F" + resultA.getLabel());
		System.out.println(b.getPlayerName() + "�F" + resultB.getLabel());
		System.out.println(c.getPlayerName() + "�F" + resultC.getLabel());
	}



}
