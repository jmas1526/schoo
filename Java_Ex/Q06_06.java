import java.util.Scanner;

class Q06_06 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		System.out.print("人数：");
		int n = keyboardIn.nextInt();
		int[] score = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++){
			System.out.print((i + 1) + "人目の点数：");
			score[i] = keyboardIn.nextInt();
			sum += score[i];
		}
		
		int max = score[0];
		int min = score[0];
		for(int i = 1; i < n ; i++){
			if(score[i] > max) max = score[i];
			if(score[i] < min) min = score[i];
		}
		double ave = (double)sum/n;
		System.out.println("最高点：" + max);
		System.out.println("最低点：" + min);
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + ave);
	}
}
