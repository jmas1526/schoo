import java.util.Scanner;
import java.util.Random;

public class Exercise8_2 {

	static Scanner stdIn=new Scanner(System.in);
	static Random rand=new Random();
	
	public static void main(String[] args) {
		
		System.out.println("車のデータを入力せよ。");
		System.out.print("名前は："); String name=stdIn.next();
		System.out.print("車幅は："); int width=stdIn.nextInt();
		System.out.print("車高は："); int height=stdIn.nextInt();
		System.out.print("車長は："); int length=stdIn.nextInt(); 
		System.out.print("重量は："); int weight=stdIn.nextInt();
		System.out.print("ガソリン量は："); double fuel=stdIn.nextDouble();
		System.out.print("燃費は："); double fuelEco=stdIn.nextDouble();
		
		Car myCar=new Car(name,width,height,length,weight,fuel,fuelEco);
		
		while(true) {
			System.out.println("現在地("+myCar.getX()+","+myCar.getY()+")・残り燃料"+myCar.getFuel()+"・天気："+myCar.getWeather());
			
			System.out.print("移動しますか[0…No/1…Yes]：");
			if(stdIn.nextInt()==0) break;
			
			System.out.print("X方向の移動距離：");
			double dx=stdIn.nextDouble();
			System.out.print("Y方向の移動距離：");
			double dy=stdIn.nextDouble();
		
			if(!myCar.move(dx, dy,fuelEco)) System.out.println("燃料が足りません。");
		}
	}
}

