package test;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_Ex2_1 {
	
	
	public static void main(String[] args) {
		
		ArrayList<Double> d = inputDataUntil1000();
		
		System.out.println(d);
		
		System.out.println("���`�T���Ɉڂ�܂��B");
		System.out.print("�T�����l�F");
		Scanner sc = new Scanner(System.in);
		double key = sc.nextDouble();
		System.out.println(key);
		int find = search(d,key);
		if(find >= 0) System.out.println(find + "�ڂɂ���܂��B");
	}
	
	
	static ArrayList<Double> inputDataUntil1000(){
		Scanner sc = new Scanner(System.in);

		ArrayList<Double> d = new ArrayList<>();
		
		int i = 0;
		double sum = 0;
		do {
			System.out.print(i + "�ڂ̗v�f�F");
			double in = sc.nextDouble();
			sum += in;
			d.add(in);
			if(sum > 1000) break;
			i++;
			
		}while(true);
		
		System.out.println("���͒l�̍��v��1000�𒴂��܂����B");
		//sc.close();
		return d;
	}
	
	static int search(ArrayList<Double> list, double key) {
		for(int j = list.size() -1; j >= 0; j--) {
			if (key == list.get(j)) {
				return j;
			}
		}
		System.out.println("����܂���ł����B");
		return -1;
	}
}
