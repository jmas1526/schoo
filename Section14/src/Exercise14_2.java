import java.util.Scanner;

class Exercise14_2{
	public static void main(String[]args) {
		Scanner stdIn = new Scanner(System.in);
		
		RobotPet a = new RobotPet("pochi","Nick");
		
		a.introduce();
		
		System.out.print("何をしてもらいますか。（0:掃除、1:洗濯、2:炊事)");
		int b = stdIn.nextInt();
		a.work(b);
		
		a.changeSkin(Skinnable.LEOPARD);
	}
}