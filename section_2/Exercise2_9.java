import java.util.Random;

class Exercise2_9{
	public static void main(String[] args){
		Random rand = new Random();
		
		double a=rand.nextDouble();
		double b=(rand.nextDouble())*10;
		double c=((rand.nextDouble())*2)-1;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
