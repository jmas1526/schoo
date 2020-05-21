import java.util.Scanner;

class Q08_02 {
	static Scanner keyboardIn = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("初期情報を入力します");
		System.out.print("愛車の名前：");
		String name = keyboardIn.next();
		System.out.print("車幅[mm]：");
		int width = keyboardIn.nextInt();
		System.out.print("車高[mm]：");
		int height = keyboardIn.nextInt();
		System.out.print("車長[mm]：");
		int length = keyboardIn.nextInt();
		System.out.print("タンク容量[L]：");
		double tank = keyboardIn.nextDouble();
		System.out.print("燃費[km/L]：");
		double distPerL = keyboardIn.nextDouble();
		System.out.print("ナンバー：");
		int number = keyboardIn.nextInt();
		Car myCar = new Car(name, width, height, length, tank, distPerL, number);
		
		System.out.println("\n初期情報を表示します");
		myCar.putSpec();
		
		myCar.menu();
	}
	
}

class Car{
	static Scanner keyboardIn = new Scanner(System.in);
	//フィールド
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private double tank;
	private double distPerL; //distance per Liter
	private int number;
	
	//コンストラクタ
	Car(String name, int width, int height, int length, double tank, double distPerL, int number){
				
		this.name = name;
		this.width = width;
		this.height  = height;
		this.length = length;
		this.tank = tank;
		x = y = 0.0;
		this.fuel = tank;
		this.distPerL = distPerL;
		this.number = number;
	}
	
	//////////////////メソッド
	//各値取得
	double getX(){
		return x;
	}
	double getY(){
		return y;
	}
	double getFuel(){
		return fuel;
	}
	
	//スペック表示
	void putSpec(){
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
		System.out.println("タンク容量：" + tank + "L");
		System.out.println("燃費：" + distPerL + "km/L");
		System.out.printf("ナンバー：%04d\n", number);
	}
	void putFuel(){
		System.out.println("燃料残量：" + fuel);
		System.out.println("走行可能距離：" + fuel * distPerL);
	}
	
	//移動
	void moveTo(double toX, double toY){
		double dx = toX - x;
		double dy = toY - y;
		if(!move(dx,dy))
			System.out.println("燃料が足りません！");
	}
	boolean move(double dx, double dy){
		double dist = Math.sqrt(dx * dx + dy * dy);
		if(dist > fuel * distPerL) return false;
		else{
			fuel -= dist/distPerL;
			x += dx;
			y += dy;
			return true;
		}
	}
	//給油
	void addFuel(double diff){
		fuel += diff;
		fuel = fuel < tank ? fuel : tank;
	}
	
	//menu
	void menu(){
		int mode = -1;
		do{
			System.out.println();
			switch(mode){
			case 1: 
				System.out.println("スペックを表示します");
				putSpec();
				break;
			case 2: 
				System.out.println("燃料の残量と走行可能距離を表示します");
				putFuel();
				break;
			case 3: 
				System.out.println("給油します");
				System.out.print("給油量：");
				addFuel(keyboardIn.nextDouble());
				break;
			case 4: 
				System.out.println("現在地(x,y) = (" + x + ", " + y + ")");
				System.out.println("目的地を入力してください");
				System.out.print("X座標：");
				double toX = keyboardIn.nextDouble();
				System.out.print("Y座標：");
				moveTo(toX,keyboardIn.nextDouble());
				break;
			default: break;
			}
			System.out.println("\n次の処理を選択してください");
			System.out.println("1.スペック表示 / 2.燃料状況表示 / 3.給油 / 4.移動 / 0.終了");
			System.out.print("次の処理番号：");
			mode = keyboardIn.nextInt();
		}while(mode != 0);
	}
}
