import java.util.Scanner;

/**
 * このクラスはjavadoc練習用の人間クラスです。
 * 
 * @author gojin
 * @see Day
 *
 */
public class Q13_4{
	
	//フィールド
	/**
 	 * 名前示すString型のフィールドです。
	 */
	private String name;
	/**
	 * 年齢を示すint型のフィールドです。
	 */
	private int age;
	/**
	 * 身長を示すdouble型のフィールドです。
	 */
	private double height;
	/**
	 * 
	 * 体重を示すdouble型のフィールドです。
	 */
	private double weight;
	/**
	 * BMIを示すint型のフィールドです。
	 * 
	 */
	private double bmi;
	/**
	 * 血液型を示すString型のフィールドです。
	 */
	private String bloodType;
	/**
	 * 誕生日を示すクラスDay型のフィールドです。
	 * 
	 */
	private Day birthday;
	
	//コンストラクタ
	/**
	 * 誕生日のない人間クラスを生成するコンストラクタです。
	 * 誕生日はnullとなります。
	 * @param name 名前
	 * @param age 年齢
	 * @param height 身長
	 * @param weight 体重
	 * @param bloodType 血液型
	 */
	public Q13_4(String name, int age, double height, double weight, String bloodType){
		this.name = name;
		this.age = age;
		this.height  = height;
		this.weight = weight;
		bmi = weight / height / height;
		this.bloodType = bloodType;
		this.birthday = null;
	}
	
	/**
	 * 誕生日を引数として受け取るコンストラクタです。
	 * @param name 名前
	 * @param age 年齢
	 * @param height 身長
	 * @param weight 体重
	 * @param bloodType 血液型
	 * @param birthday 誕生日
	 */
	public Q13_4(String name, int age, double height, double weight, String bloodType,Day birthday){
		this.name = name;
		this.age = age;
		this.height  = height;
		this.weight = weight;
		bmi = weight / height / height;
		this.bloodType = bloodType;
		this.birthday = birthday;
	}
	
	//////////////////メソッド
	
	static Scanner keyboardIn = new Scanner(System.in);
	/**
	 * @param args コマンドライン引数の配列
	 */
	public static void main(String[] args) {
		System.out.println("文書化コメントの作成");
	}
	
	
	//各値取得
	/**
	 * 名前を返却します
	 * @return フィールドの「名前」を返却します
	 */
	String getName(){
		return name;
	}
	/**
	 * 年齢を返却します
	 * @return フィールドの「年齢」を返却します
	 */
	int getAge(){
		return age;
	}
	/**
	 * 身長を返却します
	 * @return フィールドの「身長」を返却します
	 */
	double getHeight(){
		return height;
	}
	/**
	 * 体重を返却します
	 * @return フィールドの「体重」を返却します
	 */
	double getWeight(){
		return weight;
	}
	/**
	 * BMIを返却します
	 * @return フィールドの「BMI」を返却します
	 */
	double getBmi(){
		return bmi;
	}
	/**
	 * 血液型を返却します
	 * @return フィールドの「血液型」を返却します
	 */
	String getBloodType(){
		return bloodType;
	}
	/**
	 * 誕生日を返却します
	 * @return フィールドの「誕生日」を返却します
	 */
	Day getBirthday() {
		return new Day(birthday);
	}
	
	
	//toString
	/**
	 *メソッドtoStringは、名前と年齢を返します
	 *@return 「(名前) (年齢)歳」と返却します
	 */
	@Override
	public String toString() {
		return this.name + " " + age + "歳";
	}
	
	//全データ表示
	/**
	 * インスタンスの全情報をコンソールに表示します
	 */
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
	
	/**
	 * 年齢を変更します
	 * @param diff 変更する年齢の増分
	 */
	void addAge(int diff){
		age += diff;
		if(age < 0) System.out.println("警告：年齢がマイナス値になりました");
	}
	
	/**
	 * 身長を変更します
	 * @param diff 変更する身長の増分
	 */
	void addHeight(double diff){
		height += diff;
		if(height < 0) System.out.println("警告：身長がマイナス値になりました");
		bmi = weight / height / height;
	}
	
	/**
	 * 体重を変更します
	 * @param diff 変更する体重の増分
	 */
	void addWeight(double diff){
		weight += diff;
		if(weight < 0) System.out.println("警告：体重がマイナス値になりました");
		bmi = weight / height / height;
	}
	
	//menu
	/**
	 * コンソールからインスタンスの操作を行うことができます\n
	 * データの表示、年齢・身長・体重の変更が可能です
	 */
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
