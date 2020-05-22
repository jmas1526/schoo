class Pet {
	private String name;				// ペットの名前
	private String masterName;		// 飼い主の名前

	// コンストラクタ
	public Pet(String name, String masterName) {
		this.name = name;						// ペットの名前
		this.masterName = masterName;		// 飼い主の名前
	}

	// ペットの名前を調べる
	public String getName() { return name; }

	// 飼い主の名前を調べる
	public String getMasterName() { return masterName; }

	// 自己紹介
	public void introduce() {
		System.out.println("■僕の名前は" + name + "です！"); 
		System.out.println("■ご主人様は" + masterName + "です！");
	}
}

