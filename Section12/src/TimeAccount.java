class TimeAccount extends Account {
	private long timeBalance;				// 預金残高（定期預金）

	// コンストラクタ
	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);			// クラスAccountのコンストラクタの呼出し
		this.timeBalance = timeBalance;	// 預金残高（定期預金）
	}
	
	//classmethod
	//合計額を比較し、aのほうが大きければ1、等しければ0、bのほうが大きければ-1を返却
	static int compBalance(Account a,Account b) {
			
		long aSum;
		long bSum;
			
		//create aSum
		if(a instanceof TimeAccount ) {
			aSum = a.getBalance() + ((TimeAccount)a).getTimeBalance();
		}else {
			aSum = a.getBalance();
		}
			
		//create bSum
		if(b instanceof TimeAccount ) {
			bSum = b.getBalance() + ((TimeAccount)b).getTimeBalance();
		}else {
			bSum = b.getBalance();
		}
			
		if(aSum>bSum) return 1;
		else if(aSum==bSum) return 0;
		else return -1;
	}
	
	// instancemethod
	// 定期預金残高を調べる
	long getTimeBalance() {
		return timeBalance;
	}

	// 定期預金を解約して全額を普通預金に移す
	void cancel(long k) {
		deposit(timeBalance);
		timeBalance = 0;
	}
	
	
}
