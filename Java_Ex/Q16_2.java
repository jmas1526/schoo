import java.util.Scanner;
public class Q16_2 {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);
		
		System.out.print("����a�F");
		int a = keyboardIn.nextInt();
		System.out.print("����b�F");
		int b = keyboardIn.nextInt();
		keyboardIn.close();
		
		try {
			System.out.println("�����̘a��" + add(a, b) + "�ł��B");
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
		super("�͈͊O�̒l�F" + n);
	}
}

class ParameterRangeError extends RangeError {
	public ParameterRangeError(int n) {
		super(n);
	}
	@Override
	public String getMessage() {
		return "�����鐔���͈͊O�ł��B" + super.getMessage();
	}
}

class ResultRangeError extends RangeError {
	ResultRangeError(int n){
		super(n);
	}
	@Override
	public String getMessage() {
		return "�v�Z���ʂ��͈͊O�ł��B" + super.getMessage();
	}
}
