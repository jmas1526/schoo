import java.util.Random;

class Exercise3_17{
	public static void main(String[] args){
		
		Random rand=new Random();
		
		int a=rand.nextInt(3);
		
		switch (a){
			case 0: System.out.println("グー"); break;
			case 1: System.out.println("チョキ"); break;
			case 2: System.out.println("パー"); break;
		}
		
	}
}