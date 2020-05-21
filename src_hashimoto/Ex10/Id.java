
class Id {

	static int counter = 0;

	private int id;

	public Id() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}

	//追加分
	public static int getMaxId() {
		return counter;
	}

}

