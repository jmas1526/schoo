public class Account{
	
	private String name;
	private String no;
	private long balance;
	private Day openDay;
	
	//インスタンス初期化子
	{
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}
	
	//コンストラクタ
	public Account(String n, String num, long z, Day d){
		name = n;
		no = num;
		balance = z;
		openDay = d;
	}
	
	//getter
	public String getName(){
		return name;
	}
	public String getNo(){
		return no;
	}
	public long getBalance(){
		return balance;
	}
	public Day getOpenDay() {
		return new Day(openDay);
	}
	
	public void deposit(long k){
		balance += k;
	}
	
	public void withdraw(long k){
		balance -= k;
	}
	
}






class TimeAccount extends Account{
	private long timeBalance;
	
	//コンストラクタ
	TimeAccount(String n, String num, long balance, long timeBalance, Day day){
		super(n, num, balance, day);
		this.timeBalance = timeBalance;
	}
	
	//getter
	long getTimeBalance() {
		return timeBalance;
	}
	
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}
}
