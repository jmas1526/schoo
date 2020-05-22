
public class LowerRight extends IsoscelesRightTriangle {
	public LowerRight(int bottom) {
		super(bottom);
		}
	
	public String toString() {
		return "LowerRight(bottom:" + getBottom()  + ")"; 
	}
	
	public void draw() {
		for(int i=0;i<getBottom();i++){
			for(int j=getBottom()-i;j>0;j--){
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
