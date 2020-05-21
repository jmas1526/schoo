import java.util.Scanner;

class Q07_27 {
	static Scanner keyboardIn = new Scanner(System.in);
	
	public static void main(String[] args){
		int[][] x = makeMatrix("x");
		int[][] y = makeMatrix("y");
		int[][] z = new int[x.length][x[0].length];
		
		if (addMatrix(x,y,z)){
			System.out.println("���Z���ʂ�\�����܂�");
			printMatrix(z);
		}else System.out.println("�v�f�����قȂ�܂�");
	}
	
	public static boolean addMatrix(int[][] x,int[][] y, int[][] z){
		if (x.length != y.length || x.length != z.length)
			return false;
		for(int i = 0; i < x.length; i++){
			if(x[i].length != y[i].length || x[i].length != z[i].length)
				return false;
		}
		
		for(int i = 0; i < x.length; i++)
			for(int j = 0; j < x[i].length; j++)
				z[i][j] = x[i][j] + y[i][j];
		return true;
	}
	
	public static void printMatrix(int[][] m){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}
	
	public static int[][] makeMatrix(String name){
		System.out.println(name + "�̔z����쐬���܂�");
		int h;
		do{
			System.out.print("�z��̍s���F");
			h = keyboardIn.nextInt();
		}while(h < 1);
		int w;
		do{
			System.out.print("�z��̗񐔁F");
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
