import java.util.Scanner;

class Q04_15 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int min,max,d;
		do{
			System.out.print("何cmから：");
			min = keyboardIn.nextInt();
		}while(min < 100);
		do{
			System.out.print("何cmまで：");
			max = keyboardIn.nextInt();
		}while(max < min);
		do{
			System.out.print("何cmごと：");
			d = keyboardIn.nextInt();
		}while(d <= 0);
		
		System.out.println("身長\t標準体重");
		for(int height = min; height <= max; height += d) {
			System.out.println(height + "\t" + ((height-100) * 0.9));
		}
	}
}
