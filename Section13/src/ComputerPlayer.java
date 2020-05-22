import java.util.Random;

public class ComputerPlayer extends Player{
	Random rand = new Random();
	
	@Override
	public int createHand() {
		int computerHand = rand.nextInt(3);
		return computerHand;
	}
}
