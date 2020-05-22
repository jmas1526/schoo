import java.util.Random;

class Car {
	Random rand=new Random();
	
	private String name;
	private int width;
	private int height;
	private int weight;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private double fuelEco;//”R”ï
	private String weather;//ŽÔŠO‚Ì“V‹C
	
	Car(String name,int width,int height,int weight,int length,double fuel,double fuelEco){
		this.name=name;
		this.width=width;
		this.height=height;
		this.weight=weight;
		this.length=length;
		this.fuel=fuel;
		this.fuelEco=fuelEco;
		
		x=y=0.0;
	}
	
	double getX() {return x;}
	double getY() {return y;}
	double getFuel(){return fuel;}
	double getFuelEco() {return fuelEco;}
	String getWeather() {
		int a=rand.nextInt(3);
		if(a==0) return "°‚ê";
		else if(a==1) return "‰J";
		else return "“Ü‚è";
	}
	
	void putSpec() {
		System.out.println("–¼‘O:"+name);
		System.out.println("ŽÔ•:"+width+"mm");
		System.out.println("ŽÔ‚:"+height+")mm");
		System.out.println("ŽÔ’·:"+length+"mm");
		System.out.println("d—Ê:"+weight+"kg");
		System.out.println("”R”ï:"+fuelEco);
	}
	
	boolean move(double dx,double dy,double fuelEco) {
		double dist=Math.sqrt(dx*dx+dy*dy);
		
		if(dist/fuelEco > fuel) return false;
		else {
			fuel-=(dist/fuelEco);
			x+=dx;
			y+=dy;
			return true;
		}
	}
}


