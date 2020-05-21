import java.util.Scanner;

class Q06_19 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		
		//クラス数入力
		System.out.print("クラス数：");
		int c = keyboardIn.nextInt();
		
		double[][] sumave = new double[2][c];
		int people = 0;
		//人数と点数入力
		int[][] score = new int[c][];
		for(int i = 0; i < c; i++) {
			System.out.print((i + 1) + "組の人数：");
			int num = keyboardIn.nextInt();
			score[i] = new int[num];
			people += num;
			
			//点数入力と合計計算
			double sum =0;
			for(int j = 0; j < num; j++){
				System.out.print((i + 1) + "組" + (j + 1) + "番の点数：");
				score[i][j] = keyboardIn.nextInt();
				sum += score[i][j];
			}
			System.out.println();
			
			//組ごとの合計と平均を格納
			double ave = sum / num;
			sumave[0][i] = sum;
			sumave[1][i] = ave;
			
		}
		
		
		System.out.printf("  組 | 合計  平均\n");
		System.out.printf("-----+------------\n");
		//クラスごとの合計と平均
		for(int i = 0; i < c; i++) {
			System.out.printf("%2d組 |%5.0f %5.1f\n",i + 1 ,sumave[0][i] ,sumave[1][i]);
		}
		
		//全体の合計と平均
		double Sum = 0;
		for(double sum : sumave[0]) {
			Sum += sum;
		}
		double Ave = Sum;
		
		Ave /= people;
		
		System.out.printf("-----+------------\n");
		System.out.printf("  計 |%5.0f %5.1f\n",Sum ,Ave);
		
	}
}
