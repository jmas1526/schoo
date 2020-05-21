package test;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_Ex2_1 {
	
	
	public static void main(String[] args) {
		
		ArrayList<Double> d = inputDataUntil1000();
		
		System.out.println(d);
		
		System.out.println("線形探索に移ります。");
		System.out.print("探す数値：");
		Scanner sc = new Scanner(System.in);
		double key = sc.nextDouble();
		System.out.println(key);
		int find = search(d,key);
		if(find >= 0) System.out.println(find + "個目にあります。");
	}
	
	
	static ArrayList<Double> inputDataUntil1000(){
		Scanner sc = new Scanner(System.in);

		ArrayList<Double> d = new ArrayList<>();
		
		int i = 0;
		double sum = 0;
		do {
			System.out.print(i + "個目の要素：");
			double in = sc.nextDouble();
			sum += in;
			d.add(in);
			if(sum > 1000) break;
			i++;
			
		}while(true);
		
		System.out.println("入力値の合計が1000を超えました。");
		//sc.close();
		return d;
	}
	
	static int search(ArrayList<Double> list, double key) {
		for(int j = list.size() -1; j >= 0; j--) {
			if (key == list.get(j)) {
				return j;
			}
		}
		System.out.println("ありませんでした。");
		return -1;
	}
}
