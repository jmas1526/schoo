import java.util.Scanner;

class Q10_01 {
	static Scanner keyboardIn = new Scanner(System.in);
	public static void main(String[] args){
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		
		System.out.println("getMaxId = " + Id.getMaxId());
		
	}
	
}

class Id{
	static int counter = 0;
	
	private int id;
	
	//コンストラクタ
	public Id(){
		id = ++counter;
	}
	
	
	//////////////////メソッド
	//getter
	int getId(){
		return id;
	}
	
	static int getMaxId(){
		return counter;
	}
}
