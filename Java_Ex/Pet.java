
public class Pet {
	private String name;
	private String masterName;
	
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}
	
	public String getName() {
		return name;
	}
	public String getMasterName() {
		return masterName;
	}
	
	public void introduce() {
		System.out.println("���l�̖��O��" + name + "�ł��I");
		System.out.println("������l�l��" + masterName + "�ł��I");
	}

}

class RobotPet extends Pet{
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	@Override public void introduce() {
		System.out.println("�����̓��{�b�g�B���O��" + getName() + "�B");
		System.out.println("������l�l��" + getMasterName() + "�B");
	}
	
	public void work(int sw) {
		switch(sw) {
		case 0:
			System.out.println("�|�����܂��B");
			break;
		case 1:
			System.out.println("���󂵂܂��B");
			break;
		case 2:
			System.out.println("�������܂��B");
			break;
		}
	}
}
