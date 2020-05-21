public class Ex0801 {

	public static void main(String[] args) {


		Human hashimoto = new Human("橋本", 1.7, 70.0, 22);

		System.out.printf("%sさんは身長%fm、体重%fkg、年齢は%d歳です。\n",
				hashimoto.getName(), hashimoto.getHeight(), hashimoto.getWeight(), hashimoto.getAge());


		hashimoto.changeName("鉄郎");
		hashimoto.updateHeight(0.02);
		hashimoto.updateWeight(5);
		hashimoto.updateAge();


		System.out.printf("1年後の%sさんは身長%fm、体重%fkg、年齢は%d歳です。\n",
				hashimoto.getName(), hashimoto.getHeight(), hashimoto.getWeight(), hashimoto.getAge());

	}

}