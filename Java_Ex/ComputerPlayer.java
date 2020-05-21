import java.util.Random;

public class ComputerPlayer extends RSP_Player {
	Random rand = new Random();

	public ComputerPlayer(String name) {
		super(name);
	}
	
	@Override
	public int chooseHand() {
		return rand.nextInt(3);
	}

}
