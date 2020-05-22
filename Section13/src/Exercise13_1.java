import java.util.Scanner;

public class Exercise13_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("図形は何個：");
		int n = stdIn.nextInt();
		
		Shape[]a = new Shape[n];
		
		for(int i=0;i<n;i++) {
			int[]x = new int[n];
			System.out.print(i+1+"番の図形の種類（1...点/2...水平直線/3...垂直直線/4...長方形）：");
			x[i] = stdIn.nextInt();
			
			if(x[i]==2) {
				System.out.print("長さ：");
				int length = stdIn.nextInt();
				a[i]=new HorzLine(length);
			}else if(x[i]==3) {
				System.out.print("長さ：");
				int length = stdIn.nextInt();
				a[i]=new VertLine(length);
			}else if(x[i]==4) {
				System.out.print("幅：");
				int width = stdIn.nextInt();
				System.out.print("高さ：");
				int height = stdIn.nextInt();
				a[i]=new Rectangle(width,height);
			}else {
				a[i]=new Point();
			}
		}
		for(int i=0;i<n;i++) {
			a[i].print();
		}
	}
}
