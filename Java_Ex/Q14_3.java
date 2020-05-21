import java.util.Scanner;
public class Q14_3 {

	public static void main(String[] args) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		usePlayer(dvdPlayer);
	}
	
	public static void usePlayer(DVDPlayer dvdPlayer) {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("次は？　操作...1 / 終了... 0：");
			if(scan.nextInt() != 1) break;
			int button;
			System.out.println("どのボタンを押す？　再生...1 / スロー再生...2 / 停止...0：");
			button = scan.nextInt();
			switch(button) {
			case 0:
				dvdPlayer.stop();
				break;
			case 1:
				dvdPlayer.play();
				break;
			case 2:
				dvdPlayer.slow();
				break;
			default:
				System.out.println("存在しないボタンです");
				break;
			}			
		}while(true);
		scan.close();
	}

}
