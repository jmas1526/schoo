
public class Human {

	private String name;  //名前
	private double height;  //身長
	private double weight;  //体重
	private int age;  //年齢

	Human(String name, double height, double weight, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	//名前を取得
	String getName() {
		return this.name;
	}

	//身長を取得
	double getHeight() {
		return this.height;
	}

	//体重を取得
	double getWeight() {
		return this.weight;
	}

	//年齢を取得
	int getAge() {
		return this.age;
	}

	//名前を変更
	void changeName(String name) {
		this.name = name;
	}

	//身長を更新
	void updateHeight(double x) {
		this.height += x;
	}

	//体重を更新
	void updateWeight(double x) {
		this.weight += x;
	}

	//年齢を更新
	void updateAge() {
		this.age++;
	}

}
