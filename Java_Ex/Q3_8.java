import java.util.Scanner;

class Q3_8 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("点数：");
		int score = keyboardIn.nextInt();
		
		if(score >= 0 && score <=100){
			if(score < 60){
				System.out.println("不可");
			}else if(score < 70) {
				System.out.println("可");
			}else if (score < 80){
				System.out.println("良");
			}else{
				System.out.println("優");
			}
		}else{
			System.out.println("不正な値が入力されました。");
		}
	}
}