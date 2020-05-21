
public class RightDownRightIsoscelesTriangle extends RightIsoscelesTriangle {

	public RightDownRightIsoscelesTriangle(int l) {
		super(l);
	}

	@Override
	public void draw() {
		for(int i = 0; i < getLength(); i++) {
			for (int j = 0; j < getLength() - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
