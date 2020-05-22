import java.util.Scanner;

public class Exercise13_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("図形は何個：");
		int n = stdIn.nextInt();
		
		Shape[]a = new Shape[n];
		
		for(int i=0;i<n;i++) {
			int[]x = new int[n];
			System.out.print(i+1+"番の直角三角形の種類（1...左上/2...左下/3...右上/4...右下）：");
			x[i] = stdIn.nextInt();
			System.out.print("長さ：");
			int bottom = stdIn.nextInt();
			if(x[i]==1) {
				a[i]=new UpperLeft(bottom);
			}else if(x[i]==2) {
				a[i]=new LowerLeft(bottom);
			}else if(x[i]==3) {
				a[i]=new UpperRight(bottom);
			}else if(x[i]==4){
				a[i]=new LowerRight(bottom);
			}
		}
		for(int i=0;i<n;i++) {
			a[i].print();
		}
	}
}
