
public class Tester {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Gojin go = new Gojin();
		System.out.print(go.getNum());
		
	}

}


class Gojin{
	private static int g;
	private int num;
	static {
		g = 2;
	}
	{
		num = 4;
		System.out.println(g);
		System.out.print(num);
	}
	public Gojin() {
	}
	
	public int getNum() {
		return this.num;
	}
}