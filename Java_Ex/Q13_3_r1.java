import java.util.Scanner;

public class Q13_3_r1 {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);
		
		HumanPlayer_r1 human = new HumanPlayer_r1("player");
		ComputerPlayer_r1 com = new ComputerPlayer_r1("COM");
		
		
		boolean retry = false;
		do {
			int winnerId = -2;
			try {
				winnerId = (RSP_Player_r1.play(human, com));
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e);
				break;
			}
			
			if(winnerId == -1) {
				System.out.println(RSP_Player_r1.Result.draw.getLabel());
			}else if(winnerId == human.getPlayerId()) {
				System.out.println(RSP_Player_r1.Result.win.getLabel());				
			}else if(winnerId == com.getPlayerId()) {
				System.out.println(RSP_Player_r1.Result.lose.getLabel());				
			}else {
				System.out.println("不正な値です。終了します。");
				break;
			}
			
			System.out.print("retry? Y...1 / N...0(もしくは1以外)：");
			try {
				retry = keyboardIn.next().equals("1");				
			} catch (Exception e){
				System.out.println("エラー発生： " +e);
				System.out.println("終了します");
				break;
			}
			System.out.println();
		} while (retry);
		keyboardIn.close();
	}
}
