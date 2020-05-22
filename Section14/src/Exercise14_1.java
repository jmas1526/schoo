import java.util.Scanner;

public class Exercise14_1 {
	public static void main(String[]args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("長方形の底辺：");
		int a = stdIn.nextInt();
		System.out.print("長方形の高さ：");
		int b = stdIn.nextInt();
		
		Rectangle x = new Rectangle(a,b);
		
		System.out.print("平行四辺形の底辺の幅：");
		int c = stdIn.nextInt();
		System.out.print("平行四辺形の高さ：");
		int d = stdIn.nextInt();
		
		Parallelogram y = new Parallelogram(c,d);
		
		x.draw();
		System.out.println("長方形の面積："+x.getArea());
		
		y.draw();
		System.out.println("平行四辺形の面積："+y.getArea());
	}

}
