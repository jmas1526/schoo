import java.util.Scanner;

public class HumanPlayer extends Player{
	Scanner stdIn = new Scanner(System.in);
	
	public HumanPlayer(){}
	
	@Override
	public int createHand() {
		int humanHand;
		do {
			System.out.print("何を出しますか？0...グー/1...チョキ/2...パー：");
			humanHand = stdIn.nextInt();
		}while(humanHand<0 || humanHand>2);
		return humanHand;
	}
	
}
