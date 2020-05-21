import java.util.Random;

public class ComputerPlayer_r1 extends RSP_Player_r1 {
	Random rand = new Random();

	public ComputerPlayer_r1(String name) {
		super(name);
	}
	
	@Override
	public int chooseHand() {
		int hand = rand.nextInt(3);
		System.out.println(this.getPlayerName() + "ÅF" + this.hand[hand]);
		return hand;
	}

}