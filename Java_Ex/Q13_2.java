import java.util.Scanner;

public class Q13_2 {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);
		RightIsoscelesTriangle[] lit = new RightIsoscelesTriangle[4];
		lit[0] = new RightUpRightIsoscelesTriangle(5);
		lit[1] = new RightDownRightIsoscelesTriangle(5);
		lit[2] = new LeftUpRightIsoscelesTriangle(5);
		lit[3] = new LeftDownRightIsoscelesTriangle(5);
		
		boolean retry = false;
		
		do {
			System.out.print("�E��...0 / �E��...1 / ����...2 / ����...3�F");
			lit[keyboardIn.nextInt()].draw();
			System.out.print("retry? Y...1 / N...0�F");
			retry = keyboardIn.nextInt() == 1;
		}while(retry);
		keyboardIn.close();
	}

}