import java.util.Scanner;

public class HumanPlayer extends RSP_Player {
	Scanner keyboardIn = new Scanner(System.in);

	
	
	public HumanPlayer(String name) {
		super(name);
	}



	@Override
	public int chooseHand() {
		int hand;
		do {
			System.out.println("�ŏ��̓O�[�A����񂯂�");
			System.out.print("�O�[..." + rock + " / �`���L..." + scissors + " / �p�[..." + paper + "�F");
			hand = keyboardIn.nextInt();
		}while(hand < 0 || 2 < hand);
		return hand;
	}

}
