public class Account{
	
	private String name;
	private String no;
	private long balance;
	private Day openDay;
	
	//�C���X�^���X�������q
	{
		System.out.println("������s�ł̌����J�݂��肪�Ƃ��������܂��B");
	}
	
	//�R���X�g���N�^
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
	
	//�R���X�g���N�^
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
