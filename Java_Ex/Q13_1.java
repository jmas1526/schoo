import java.util.Scanner;

public class Q13_1 {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);
		System.out.print("�}�`�͉��F");
		Shape[] p = new Shape[keyboardIn.nextInt()];
		for (int i = 0; i < p.length; i++) {
			System.out.print("1...�_ / 2...�������� / 3...�������� / 4...�����`�F");
			try {
				p[i] = makeShape(keyboardIn.nextInt());
			} catch (RuntimeException e) {
				System.out.println(e + "�������܂��B");
			}
		}
		keyboardIn.close();
		
		for (Shape shape : p) {
			shape.print();
		}

	}

	static Shape makeShape(int shape) {
		Scanner keyboardIn = new Scanner(System.in);
		switch (shape) {
		case 1:
			return new Point();
		case 2:
			System.out.print("�����F");
			return new HorzLine(keyboardIn.nextInt());
		case 3:
			System.out.print("�����F");
			return new VertLine(keyboardIn.nextInt());
		case 4:
			System.out.print("���F");
			int w = keyboardIn.nextInt();
			System.out.print("�����F");
			int h = keyboardIn.nextInt();
			return new Rectangle(w, h);
		default:
			throw new RuntimeException("�\������Ă��Ȃ��l�����͂���܂����B");
		}
	}
}
