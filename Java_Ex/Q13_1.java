import java.util.Scanner;

public class Q13_1 {

	public static void main(String[] args) {
		Scanner keyboardIn = new Scanner(System.in);
		System.out.print("図形は何個：");
		Shape[] p = new Shape[keyboardIn.nextInt()];
		for (int i = 0; i < p.length; i++) {
			System.out.print("1...点 / 2...水平直線 / 3...垂直直線 / 4...長方形：");
			try {
				p[i] = makeShape(keyboardIn.nextInt());
			} catch (RuntimeException e) {
				System.out.println(e + "無視します。");
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
			System.out.print("長さ：");
			return new HorzLine(keyboardIn.nextInt());
		case 3:
			System.out.print("長さ：");
			return new VertLine(keyboardIn.nextInt());
		case 4:
			System.out.print("幅：");
			int w = keyboardIn.nextInt();
			System.out.print("高さ：");
			int h = keyboardIn.nextInt();
			return new Rectangle(w, h);
		default:
			throw new RuntimeException("予期されていない値が入力されました。");
		}
	}
}
