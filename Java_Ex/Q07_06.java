import java.util.Scanner;
class Q07_06
 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		System.out.print("‰½ŒHF");
		printSeason(keyboardIn.nextInt());
	}
	
	public static void printSeason(int m){
		if(0 < m && m < 13) {
			switch (m / 3) {
			case 0: System.out.println("“~");
				break;
			case 1: System.out.println("t");
				break;
			case 2: System.out.println("‰Ä");
				break;
			case 3: System.out.println("H");
				break;
			default: System.out.println("“~");
				break;
			}
		}else System.out.println();
	}
}
