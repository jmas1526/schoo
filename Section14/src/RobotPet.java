class RobotPet extends Pet implements Skinnable{
	
	// コンストラクタ
	public RobotPet(String name, String masterName) {
		super(name, masterName);		// スーパークラスのコンストラクタ
	}

	// 自己紹介
	public void introduce() {
		System.out.println("◇私はロボット。名前は" + getName() + "。"); 
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}

	// 家事をする
	public void work(int sw) {
		switch (sw) {
		 case 0: System.out.println("掃除します。"); break;
		 case 1: System.out.println("洗濯します。"); break;
		 case 2: System.out.println("炊事します。"); break;
		}
	}
	
	public void changeSkin(int skin) {
		System.out.print("スキンを");
		switch(skin) {
		case BLACK: System.out.println("黒"); break;
		case RED: System.out.println("赤"); break;
		case GREEN: System.out.println("緑"); break;
		case BLUE: System.out.println("青"); break;
		case LEOPARD: System.out.println("ヒョウ柄"); break;
		default: System.out.println("無地"); break;
		}
		System.out.println("に変更しました。");
	}
}

