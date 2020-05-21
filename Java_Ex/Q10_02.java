import java.util.Scanner;

class Q10_02 {
	static Scanner keyboardIn = new Scanner(System.in);
	public static void main(String[] args){
		ExId a = new ExId();
		ExId b = new ExId();
		ExId c = new ExId();
		ExId d = new ExId(4);
		ExId e = new ExId();
		ExId f = new ExId();
		System.out.println("a�F" + a.getId());
		System.out.println("b�F" + b.getId());
		System.out.println("c�F" + c.getId());
		System.out.println("d�F" + d.getId());
		System.out.println("e�F" + e.getId());
		System.out.println("f�F" + f.getId());
		
		System.out.println("getMaxId = " + ExId.getMaxId());
		
	}
	
}

class ExId{
	static int counter = 0;
	static int diff = 1;
	
	private int id;
	
	//�R���X�g���N�^
	public ExId(){
		this(diff);
	}
	public ExId(int n){
		diff = n;
		counter += diff;
		id = counter;
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
