//確認用
import java.util.Scanner;

class Exercise12_1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		CarNew car = new CarNew("name", 1, 1, 1, 1000, new Day(2020,4,1));

		car.putSpec();
		System.out.println("購入日：" + car.getPurchaseDay());
		
		while(true) {
			System.out.println("現在地("+car.getX()+","+car.getY()+")・残り燃料"+car.getFuel()+"・総移動距離"+car.getSumDist());
			
			System.out.print("移動しますか[0…No/1…Yes]：");
			if(stdIn.nextInt()==0) break;
			
			System.out.print("X方向の移動距離：");
			double dx=stdIn.nextDouble();
			System.out.print("Y方向の移動距離：");
			double dy=stdIn.nextDouble();
			
			
			if(!car.move(dx, dy)) System.out.println("燃料が足りません。");
		}
	}
}

