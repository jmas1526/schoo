
public class RightUpRightIsoscelesTriangle extends RightIsoscelesTriangle {

	RightUpRightIsoscelesTriangle(int l) {
		super(l);
	}

	@Override
	public void draw() {
		for (int i = 0; i < getLength(); i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < getLength() - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
