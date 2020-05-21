
public class Q12_2 {

	public static void main(String[] args) {
		Day today = new Day();
		Account a = new Account("","",2000,today);
		TimeAccount t = new TimeAccount("","",1000,2000,today);
		System.out.println("a:2000, t:3000..." + compBalance(a,t));
		a.deposit(5000);
		System.out.println("a:7000, t:3000..." + compBalance(a,t));
		t.deposit(4000);
		System.out.println("a:7000, t:7000..." + compBalance(a,t));
		
	}
	
	static int compBalance(Account a, Account b) {
		long totalA = 0;
		long totalB = 0;
		
		if(a instanceof TimeAccount) {
			totalA += ((TimeAccount) a).getTimeBalance();
		}
		totalA += a.getBalance();
		
		
		if(b instanceof TimeAccount) {
			totalB += ((TimeAccount) b).getTimeBalance();
		}
		totalB += b.getBalance();
		
		
		if(totalA > totalB) return 1;
		else if(totalA == totalB) return 0;
		else return -1;
	}

}
