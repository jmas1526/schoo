import java.util.Scanner;

class Q04_19 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		
		int retry;
		do{
			int month;
			do{
				System.out.print("�G�߂����߂܂��B\n�����ł����F");
				month = keyboardIn.nextInt();
			}while(month < 1 || month > 12);
			
			if(month >= 3 && month <= 5)
				System.out.println("����͏t�ł��B");
			else if(month >= 6 && month <= 8)
				System.out.println("����͉Ăł��B");
			else if(month >= 9 && month <= 11)
				System.out.println("����͏H�ł��B");
			else if(month == 12 || month == 1 || month == 2)
				System.out.println("����͓~�ł��B");
			
			System.out.print("������x? 1...Yes / 0...N0�F");
			retry = keyboardIn.nextInt();
		}while(retry == 1);
	}
}
