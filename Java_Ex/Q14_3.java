import java.util.Scanner;
public class Q14_3 {

	public static void main(String[] args) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		usePlayer(dvdPlayer);
	}
	
	public static void usePlayer(DVDPlayer dvdPlayer) {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("���́H�@����...1 / �I��... 0�F");
			if(scan.nextInt() != 1) break;
			int button;
			System.out.println("�ǂ̃{�^���������H�@�Đ�...1 / �X���[�Đ�...2 / ��~...0�F");
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
				System.out.println("���݂��Ȃ��{�^���ł�");
				break;
			}			
		}while(true);
		scan.close();
	}

}
