import java.util.Random;

class Exercise2_7{
	public static void main(String[] arg){
		
		Random rand = new Random();
		
		int a = rand.nextInt(10);
		System.out.println("1桁の正の整数値："+a);
		
		int b = rand.nextInt(10);
		System.out.println("1桁の負の整数値："+(-a));
		
		int c = rand.nextInt(100);
		System.out.print("2桁の正の整数値："+c);
	}
}
