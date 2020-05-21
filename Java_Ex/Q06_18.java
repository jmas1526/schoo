import java.util.Scanner;

class Q06_18 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		
		//行数入力
		System.out.print("行数：");
		int h = keyboardIn.nextInt();
		
		//列数入力
		int[][] c = new int[h][];
		for(int i = 0; i < h; i++) {
			System.out.print((i + 1) + "行目の列数：");
			int j = keyboardIn.nextInt();
			c[i] = new int[j];
		}
		
		//要素の入力
		for(int i = 0; i < h; i++){
			for(int j = 0; j < c[i].length; j++){
				System.out.print((i + 1) + "行目の" + (j + 1) + "列の要素：");
				c[i][j] = keyboardIn.nextInt();
			}
		}
		
		//出力
		System.out.println("c = ");
		for(int i = 0; i < h; i++){
			for(int j = 0; j < c[i].length; j++){
				System.out.printf("%4d",c[i][j]);
			}
			System.out.println();
		}
	}
}
