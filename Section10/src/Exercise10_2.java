class ExId{
	static int counter=0;
	private int id;
	static int n=1;
	
	
	//class method
	static int getMaxId() {
		return counter;
	}
	
	static int setN(int N) {
		n=N;
		return n;
	}
	
	
	//コンストラクタ
	public ExId() {
		counter+=n;
		id += counter;
	}
	
	//instance method
	public int getId() {
		return id;
	}
}

//main
public class Exercise10_2 {

	public static void main(String[] args) {
		ExId a = new ExId();
		ExId b = new ExId();
		ExId.setN(3);
		ExId c = new ExId();
		ExId d = new ExId();
		ExId e = new ExId();
		
		System.out.println("最後に与えた識別番号："+ ExId.getMaxId());
		
		System.out.println("aの識別番号："+ a.getId());
		System.out.println("bの識別番号："+ b.getId());
		System.out.println("cの識別番号："+ c.getId());
		System.out.println("dの識別番号："+ d.getId());
		System.out.println("eの識別番号："+ e.getId());
		
		
		System.out.println("Id.counter = "+ ExId.counter);
		System.out.println("a.counter = "+ a.counter);
		System.out.println("b.counter = "+ b.counter);
		
		
	}

}
