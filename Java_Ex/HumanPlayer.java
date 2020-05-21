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
			System.out.println("最初はグー、じゃんけん");
			System.out.print("グー..." + rock + " / チョキ..." + scissors + " / パー..." + paper + "：");
			hand = keyboardIn.nextInt();
		}while(hand < 0 || 2 < hand);
		return hand;
	}

}
