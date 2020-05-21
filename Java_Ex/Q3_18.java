import java.util.Scanner;

class Q3_18 {
	public static void main(String[] args){
		Scanner keyboardIn = new Scanner(System.in);
		int month = 0;
		while(month < 1 || month > 12){
			System.out.print("‰½ŒF");
			month = keyboardIn.nextInt();
		}
		
		switch(month / 3){
		case 0: System.out.println("“~");
			break;
		case 1: System.out.println("t");
			break;
		case 2: System.out.println("‰Ä");
			break;
		case 3: System.out.println("H");
			break;
		default: System.out.println("“~");
		}
	}
}