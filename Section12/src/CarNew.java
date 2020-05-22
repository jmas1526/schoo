
public class CarNew extends Car{
	private double sumDist;
	
	CarNew(String name, int width, int height, int length, double fuel,Day purchaseDay){
		super(name,width,height,length,fuel,purchaseDay);
		sumDist=0;
	}
	
	public double getSumDist() {
		return sumDist;
	}
	
	@Override
	public boolean move(double dx, double dy) {
		if(super.move(dx, dy)) {
			sumDist += Math.sqrt(dx*dx + dy*dy);
			return true;
		}else {
			System.out.println("ƒKƒ\ƒŠƒ“•s‘«‚Å‚·B");
			return false;
		}
	}

}
