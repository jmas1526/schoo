import java.util.Scanner;

class Q06_08 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("�v�f���F");
		int n = keyboardIn.nextInt();
		double[] a = new double[n];
		
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "]�̒l�F");
			a[i] = keyboardIn.nextDouble();
		}
		
		double sum = 0;
		for(double d : a){
			sum += d;
		}
		
		double ave = sum / n;
		System.out.println("���v�F" + sum);
		System.out.println("���ρF" + ave);
	}
}
