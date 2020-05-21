
class ExId {

	static int counter = 0;
	private static int n = 1;

	private int id;

	public ExId() {
		counter += n;
		id = counter;
	}

	public int getId() {
		return id;
	}

	public static int getMaxId() {
		return counter;
	}

	public static int getN() {
		return n;
	}

	public static void setN(int n) {
		if (n > 0) ExId.n = n;
	}



}

