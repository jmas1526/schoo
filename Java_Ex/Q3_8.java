import java.util.Scanner;

class Q3_8 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("�_���F");
		int score = keyboardIn.nextInt();
		
		if(score >= 0 && score <=100){
			if(score < 60){
				System.out.println("�s��");
			}else if(score < 70) {
				System.out.println("��");
			}else if (score < 80){
				System.out.println("��");
			}else{
				System.out.println("�D");
			}
		}else{
			System.out.println("�s���Ȓl�����͂���܂����B");
		}
	}
}