import java.util.Scanner;

class Q06_06 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		System.out.print("�l���F");
		int n = keyboardIn.nextInt();
		int[] score = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++){
			System.out.print((i + 1) + "�l�ڂ̓_���F");
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
		System.out.println("�ō��_�F" + max);
		System.out.println("�Œ�_�F" + min);
		System.out.println("���v�_�F" + sum);
		System.out.println("���ϓ_�F" + ave);
	}
}
