import java.util.Scanner;

class Q08_01 {
	static Scanner keyboardIn = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("初期情報を入力します");
		System.out.print("名前：");
		String name = keyboardIn.next();
		System.out.print("年齢：");
		int age = keyboardIn.nextInt();
		System.out.print("身長[m]：");
		double height = keyboardIn.nextDouble();
		System.out.print("体重[kg]：");
		double weight = keyboardIn.nextDouble();
		System.out.print("血液型[A/B/O/AB]：");
		String bloodType = keyboardIn.next();
		Human human = new Human(name, age, height, weight, bloodType);
		
		System.out.println("\n初期情報を表示します");
		human.printData();
		
		human.menu();
	}
	
}