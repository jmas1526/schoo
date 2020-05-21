import java.util.Scanner;

public class Q15_5 {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);

		HumanPlayer human = new HumanPlayer("player");
		ComputerPlayer com1 = new ComputerPlayer("COM1");
		ComputerPlayer com2 = new ComputerPlayer("COM2");


		boolean retry = false;
		do {
			play3(human,com1,com2);
			System.out.print("retry? Y...1 / N...0�F");
			retry = keyboardIn.nextInt() == 1;
			System.out.println();
		} while (retry);
		keyboardIn.close();

	}

	static void play3(RSP_Player a, RSP_Player b, RSP_Player c) {
		String result[] = { "draw", "winner", "loser" };
		final int draw = 0;
		final int winner = 1;
		final int loser = 2;
		
		int handA, handB, handC, resultA, resultB, resultC;
		handA = a.chooseHand();
		handB = b.chooseHand();
		handC = c.chooseHand();
		
		System.out.println(a.getPlayerName() + "�F" + a.getHand(handA));
		System.out.println(b.getPlayerName() + "�F" + b.getHand(handB));
		System.out.println(c.getPlayerName() + "�F" + c.getHand(handC));
		
		
		
		switch (play(handA, handB)) {
		case 0://a��b�͂�����
			switch (play(handA, handC)) {
			case 0:
				resultA = draw;
				resultB = draw;
				resultC = draw;
				break;
			case 1:
				resultA = loser;
				resultB = loser;
				resultC = winner;
				break;
			case 2:
				resultA = winner;
				resultB = winner;
				resultC = loser;
				break;
			default://�G���[
				resultA = -1;
				resultB = -1;
				resultC = -1;
				System.out.println("�G���[");
				break;
			}
			break;
		case 1://a��b�ł�b�̏���
			switch (play(handA, handC)) {
			case 0:
				resultA = loser;
				resultB = winner;
				resultC = loser;
				break;
			case 1:
				resultA = loser;
				resultB = winner;
				resultC = winner;
				break;
			case 2:
				resultA = draw;
				resultB = draw;
				resultC = draw;
				break;
			default://�G���[
				resultA = -1;
				resultB = -1;
				resultC = -1;
				System.out.println("�G���[");
				break;
			}
			break;
		case 2://a��b�ł�a�̏���
			switch (play(handA, handC)) {
			case 0:
				resultA = winner;
				resultB = loser;
				resultC = winner;
				break;
			case 1:
				resultA = draw;
				resultB = draw;
				resultC = draw;
				break;
			case 2:
				resultA = winner;
				resultB = loser;
				resultC = loser;
				break;
			default://�G���[
				resultA = -1;
				resultB = -1;
				resultC = -1;
				System.out.println("�G���[");
				break;
			}
			break;
		default://�G���[
			resultA = -1;
			resultB = -1;
			resultC = -1;
			System.out.println("�G���[");
			break;

		}
		System.out.println("==����==");
		System.out.println(a.getPlayerName() + "�F" + result[resultA]);
		System.out.println(b.getPlayerName() + "�F" + result[resultB]);
		System.out.println(c.getPlayerName() + "�F" + result[resultC]);
	}

	static int play(int a, int b) {
		switch ((a - b + 3) % 3) {
		case 0:// ������
			return 0;
		case 1:// b�̏���
			return 1;
		case 2:// a�̏���
			return 2;
		default:
			return -1;
		}
	}

}
