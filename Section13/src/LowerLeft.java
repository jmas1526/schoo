
public class LowerLeft extends IsoscelesRightTriangle {
	public LowerLeft(int bottom) {
		super(bottom);
		}
	
	public String toString() {
		return "LowerLeft(bottom:" + getBottom()  + ")"; 
	}
	
	public void draw() {
		for(int i=1;i<=getBottom();i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
