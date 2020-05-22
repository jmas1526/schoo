import java.util.Scanner;

class Exercise2_5{
	
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("xの値：");
		double x = stdIn.nextDouble();
		
		System.out.print("yの値：");
		double y = stdIn.nextDouble();
		
		System.out.println("合計は："+(x+y)+"です。");
		System.out.print("平均は："+(x+y)/2+"です。");
	}
}

	
	