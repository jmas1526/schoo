public class List16_8 {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		try {
			print(a);			
		} catch (RuntimeException e) {
			System.out.println("��O" + e);
			System.out.println("����" + e.getCause());
		} catch (Exception e) {
			System.out.println("�d��" + e.getCause());
		}

	}

	static void print(int[] a){
		try {
			for(int i = 0; i <= a.length; i++) {
				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�͈͊O�ł��B�ΏہF " + e + "���e�F " + e.getCause());
			throw new RuntimeException("reverse�o�O", e);
		}
	}
	


}
