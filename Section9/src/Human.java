
class Human {
	
	private String name;
	private int height;
	private int weight;
	private Day birthday;
	
	Human(String name,int height,int weight,Day birthday){
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.birthday=new Day(birthday);
	}
	
	Day getBirthday() {
		return new Day(birthday);
	}
	void putSpec() {
		System.out.println("name:"+name);
		System.out.println("height:"+height+"cm");
		System.out.println("weight:"+weight+"kg");
	}
	
	@Override
	public String toString() {
		return "íaê∂ì˙ÇÕ"+birthday.toString()+"Ç≈Ç∑ÅB";
	}
}
