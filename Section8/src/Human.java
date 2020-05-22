
class Human {
	
	private String name;
	private int height;
	private int weight;
	
	Human(String name,int height,int weight){
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	void putSpec() {
		System.out.println("name:"+name);
		System.out.println("height:"+height+"cm");
		System.out.println("weight:"+weight+"kg");
	}
}
