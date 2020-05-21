import java.util.Scanner;

public class Q13_3 {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);
		
		HumanPlayer human = new HumanPlayer("player");
		ComputerPlayer com = new ComputerPlayer("COM");
		
		
		boolean retry = false;
		do {
			System.out.println(human.play(com));
			System.out.print("retry? Y...1 / N...0ÅF");
			retry = keyboardIn.nextInt() == 1;
		} while (retry);
		keyboardIn.close();
	}

}
