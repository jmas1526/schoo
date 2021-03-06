import java.util.Scanner;
public class Q16_1 {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("sw：");
		int sw = keyboardIn.nextInt();
		keyboardIn.close();
		
		try {
			test(sw);
		} catch (Exception e) {
			if(e instanceof RuntimeException) {
				System.out.println(e.getMessage() +  "sw: " + sw);				
			}else {
				System.out.println(e.getMessage());
			}
		}	
	}
	
	static void test(int sw) throws Exception {
		check(sw);
	}
	
	static void check(int sw) throws Exception {
		switch(sw) {
		case 1: throw new Exception("検査例外発生!!");
		case 2: throw new RuntimeException("非検査例外発生!!");
		}
	}

}
