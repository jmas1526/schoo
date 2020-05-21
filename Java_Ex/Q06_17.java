import java.util.Scanner;

class Q06_17 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.println("点数を入力してください");
		final int[][] score = new int[6][2];//入力 [人][教科]
		final String[] subject = {"国語","数学"};
		
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 2; j++){
				System.out.print((i + 1) + "人目の" + subject[j] + "の点数：");
				score[i][j] = keyboardIn.nextInt();
			}
		}
		//科目ごと
		for(int j = 0; j < 2; j++){
			double ave = 0;
			for(int i = 0; i < 6; i++){
				ave += score[i][j];
			}
			ave = ave / 6;
			System.out.printf("%sの平均点は%.2fです。\n",subject[j], ave);
		}
		//学生ごと
		for(int i = 0; i < 6; i++){
			double ave = 0;
			for(int j = 0; j < 2; j++){
				ave += score[i][j];
			}
			ave = ave / 2;
			System.out.printf("%d人目の平均点は%.2fです。\n", i + 1, ave);
		}
	}
}
