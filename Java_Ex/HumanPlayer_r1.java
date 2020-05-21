import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer_r1 extends RSP_Player_r1 {
	Scanner keyboardIn = new Scanner(System.in);

	
	
	public HumanPlayer_r1(String name) {
		super(name);
	}



	@Override
	public int chooseHand() {
		int hand;
		
		do {
			System.out.println("�ŏ��̓O�[�A����񂯂�");
			System.out.print("�O�[..." + rock + " / �`���L..." + scissors + " / �p�[..." + paper + "�F");
			try {
				hand = keyboardIn.nextInt();	
				if((hand < 0 || 2 < hand)) throw new OutOfChoicesException();
			} catch (InputMismatchException e) {
				System.out.println(keyboardIn.next() + "�͖����ł��B\n");
				hand = -1;
			} catch (OutOfChoicesException e) {
				System.out.println(e.getMessage() + "\n");
				hand = -1;
			}
		}while(hand < 0 || 2 < hand);
		System.out.println(this.getPlayerName() + "�F" + this.hand[hand]);
		return hand;
	}
	
	public class OutOfChoicesException extends RuntimeException{
		public OutOfChoicesException() {
			super("0�`2�œ��͂��Ă�������");
		}
	}

}
