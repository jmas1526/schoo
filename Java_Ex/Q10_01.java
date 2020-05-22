import java.util.Scanner;

class Q10_01 {
	static Scanner keyboardIn = new Scanner(System.in);
	public static void main(String[] args){
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a�̎��ʔԍ��F" + a.getId());
		System.out.println("b�̎��ʔԍ��F" + b.getId());
		
		System.out.println("getMaxId = " + Id.getMaxId());
		
	}
	
}

class Id{
	static int counter = 0;
	
	private int id;
	
	//�R���X�g���N�^
	public Id(){
		id = ++counter;
	}
	
	
	//////////////////���\�b�h
	//getter
	int getId(){
		return id;
	}
	
	static int getMaxId(){
		return counter;
	}
}
