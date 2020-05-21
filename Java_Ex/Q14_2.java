
public class Q14_2 {

	public static void main(String[] args) {
		SkinnableRobotPet skinRob = new SkinnableRobotPet("ROBO", "MASTERさん");
		skinRob.introduce();
		System.out.println("--スキンを変更します--");
		skinRob.changeSkin(Skinnable.RED);
		skinRob.introduce();
	}

}

class SkinnableRobotPet extends RobotPet implements Skinnable{
	int skin = BLACK;
	String[] skinList = {"黒","赤","緑","青","豹柄"};
	
	public SkinnableRobotPet(String name, String masterName) {
		super(name, masterName);
	}

	@Override
	public void changeSkin(int skin) {
		if(skin < 0 || 4 < skin) System.out.println("存在しない色です。");
		else this.skin = skin;	
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("◇色は" + skinList[skin]);
	}
	
	
	
}