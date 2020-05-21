import java.util.Scanner;

class Q07_29 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		int[][] a = makeMatrix("a");
		
		System.out.println("コピー結果を表示します");
		int[][] b = aryClone2(a);
		printMatrix(b);
	}
	
	public static int[][] aryClone2(int[][] a) {
		int[][] b = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
			b[i][j] = a[i][j];
			}
		}
		return b;
	}
	
	public static void printMatrix(int[][] m){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}
	
	public static int[][] makeMatrix(String name){
		System.out.println(name + "の配列を作成します");
		int h;
		do{
			System.out.print("配列の行数：");
			h = keyboardIn.nextInt();
		}while(h < 1);
		int w;
		do{
			System.out.print("配列の列数：");
			w = keyboardIn.nextInt();
		}while(w < 1);
		
		
		int[][] a = new int[h][w];
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				System.out.print(name + "[" + i + "][" + j + "] = ");
				a[i][j] = keyboardIn.nextInt();
			}
		}
		return a;
	}



}
