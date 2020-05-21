public class List16_8 {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		try {
			print(a);			
		} catch (RuntimeException e) {
			System.out.println("例外" + e);
			System.out.println("原因" + e.getCause());
		} catch (Exception e) {
			System.out.println("重大" + e.getCause());
		}

	}

	static void print(int[] a){
		try {
			for(int i = 0; i <= a.length; i++) {
				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("範囲外です。対象： " + e + "内容： " + e.getCause());
			throw new RuntimeException("reverseバグ", e);
		}
	}
	


}
