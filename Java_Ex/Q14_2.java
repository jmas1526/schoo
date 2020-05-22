
public class Q14_2 {

	public static void main(String[] args) {
		SkinnableRobotPet skinRob = new SkinnableRobotPet("ROBO", "MASTER����");
		skinRob.introduce();
		System.out.println("--�X�L����ύX���܂�--");
		skinRob.changeSkin(Skinnable.RED);
		skinRob.introduce();
	}

}

class SkinnableRobotPet extends RobotPet implements Skinnable{
	int skin = BLACK;
	String[] skinList = {"��","��","��","��","�^��"};
	
	public SkinnableRobotPet(String name, String masterName) {
		super(name, masterName);
	}

	@Override
	public void changeSkin(int skin) {
		if(skin < 0 || 4 < skin) System.out.println("���݂��Ȃ��F�ł��B");
		else this.skin = skin;	
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("���F��" + skinList[skin]);
	}
	
	
	
}