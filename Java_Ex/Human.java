import java.util.Scanner;

public class Human{
	static Scanner keyboardIn = new Scanner(System.in);
	//フィールド
	private String name;
	private int age;
	private double height;
	private double weight;
	private double bmi;
	private String bloodType;
	private Day birthday;
	
	//コンストラクタ
	Human(String name, int age, double height, double weight, String bloodType){
		this.name = name;
		this.age = age;
		this.height  = height;
		this.weight = weight;
		bmi = weight / height / height;
		this.bloodType = bloodType;
		this.birthday = null;
	}
	Human(String name, int age, double height, double weight, String bloodType,Day birthday){
		this.name = name;
		this.age = age;
		this.height  = height;
		this.weight = weight;
		bmi = weight / height / height;
		this.bloodType = bloodType;
		this.birthday = birthday;
	}
	
	//////////////////メソッド
	//各値取得
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
	double getHeight(){
		return height;
	}
	double getWeight(){
		return weight;
	}
	double getBmi(){
		return bmi;
	}
	String getBloodType(){
		return bloodType;
	}
	Day getBirthday() {
		return new Day(birthday);
	}
	
	
	//toString
	@Override
	public String toString() {
		return this.name + " " + age + "歳";
	}
	
	//全データ表示
	void printData(){
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age + "歳");
		System.out.println("身長：" + height + "m");
		System.out.println("体重：" + weight + "kg");
		System.out.println("BMI：" + bmi);
		System.out.println("血液型：" + bloodType + "型");
		System.out.println("誕生日：" + birthday);
	}
	
	//値の変更
	
	void addAge(int diff){
		age += diff;
		if(age < 0) System.out.println("警告：年齢がマイナス値になりました");
	}
	
	void addHeight(double diff){
		height += diff;
		if(height < 0) System.out.println("警告：身長がマイナス値になりました");
		bmi = weight / height / height;
	}
	
	void addWeight(double diff){
		weight += diff;
		if(weight < 0) System.out.println("警告：体重がマイナス値になりました");
		bmi = weight / height / height;
	}
	
	//menu
	void menu(){
		int mode = -1;
		do{
			switch(mode){
			case 1: 
				System.out.println("データを表示します");
				printData();
				break;
			case 2: 
				System.out.println("現在" + age +  "歳です");
				System.out.print("年齢の増分：");
				addAge(keyboardIn.nextInt());
				break;
			case 3: 
				System.out.println("現在" + height +  "mです");
				System.out.print("身長の増分：");
				addHeight(keyboardIn.nextDouble());
				break;
			case 4: 
				System.out.println("現在" + weight +  "kgです");
				System.out.print("体重の増分：");
				addWeight(keyboardIn.nextDouble());
				break;
			default: break;
			}
			System.out.println("\n次の処理を選択してください");
			System.out.println("1.データ表示 / 2.年齢変更 / 3.身長変更 / 4.体重変更 / 0.終了");
			System.out.print("次の処理番号：");
			mode = keyboardIn.nextInt();
		}while(mode != 0);
	}
}
