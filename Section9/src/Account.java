// 銀行口座クラス【第２版】
class Account {
	private String name;			// 口座名義
	private String no;			// 口座番号
	private long balance;		// 預金残高
	private Day AccountOpeningDate; //口座開設日
	
	//--- コンストラクタ ---//
	Account(String n, String num, long z,Day AccountOpeningDate) {
		name = n;					// 口座名義
		no = num;					// 口座番号
		balance = z;				// 預金残高
		this.AccountOpeningDate=new Day(AccountOpeningDate);
	}

	//--- 口座名義を調べる ---//
	String getName() {
		return name;
	}

	//--- 口座番号を調べる ---//
	String getNo() {
		return no;
	}

	//--- 預金残高を調べる ---//
	long getBalance() {
		return balance;
	}
	
	//--- 口座開設日を調べる ---//
	Day getAccountOpeningDate() {
		return new Day(AccountOpeningDate);
	}

	//--- k円預ける ---//
	void deposit(long k) {
		balance += k;
	}

	//--- k円おろす ---//
	void withdraw(long k) {
		balance -= k;
	}
	
	@Override
	public String toString() {
		return "口座開設日は"+AccountOpeningDate.toString()+"です。";
	}
}
