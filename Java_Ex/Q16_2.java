import java.util.Scanner;
public class Q16_2 {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("整数a：");
		int a = keyboardIn.nextInt();
		System.out.print("整数b：");
		int b = keyboardIn.nextInt();
		keyboardIn.close();
		
		try {
			System.out.println("それらの和は" + add(a, b) + "です。");
		} catch (RangeError e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	static int add(int a, int b) {
		if(!isValid(a)) throw new ParameterRangeError(a);
		if(!isValid(b)) throw new ParameterRangeError(b);
		int result = a+b;
		if(!isValid(result)) throw new ResultRangeError(result);
		return result;
	}
	
	static boolean isValid(int n) {
		return n >= 0 && n <= 9;
	}
}

class RangeError extends RuntimeException {
	public RangeError(int n) {
		super("範囲外の値：" + n);
	}
}

class ParameterRangeError extends RangeError {
	public ParameterRangeError(int n) {
		super(n);
	}
	@Override
	public String getMessage() {
		return "加える数が範囲外です。" + super.getMessage();
	}
}

class ResultRangeError extends RangeError {
	ResultRangeError(int n){
		super(n);
	}
	@Override
	public String getMessage() {
		return "計算結果が範囲外です。" + super.getMessage();
	}
}
