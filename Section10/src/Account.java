
public class Account {
	private static int counter = 0;
	private String name;
	private String no;
	private long balance;
	private int id;
	
	{
		System.out.println("–¾‰ğ‹âs‚Å‚ÌŒûÀŠJİ‚ ‚è‚ª‚Æ‚¤‚²‚´‚¢‚Ü‚·B");
	}
	
	public Account(String n,String num,long z) {
		name=n;
		no=num;
		balance=z;
		id=++counter;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public int getId() {
		return id;
	}
	
	public void deposit(long k) {
		balance+=k;
	}
	
	public void withDraw(long k) {
		balance-=k;
	}

}
