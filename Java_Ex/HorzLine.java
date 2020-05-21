
public class HorzLine extends AbstLine{
	public HorzLine(int length) {
		super(length);
	}
	
	public String toString() {
		return "HorzLine(length�F" + getLength()+ ")";
	}

	@Override public void draw() {
		for (int i = 0; i < getLength(); i++)
			System.out.print('-');
		System.out.println();
	}
}
