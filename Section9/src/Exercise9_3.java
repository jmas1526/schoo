


// 銀行口座クラス【第２版】をテストするクラス
class Exercise9_3 {

	public static void main(String[] args) {
		
		Day o_day = new Day(2020,1,1);
		// 足立君の口座
		Account adachi = new Account("足立幸一", "123456", 1000,o_day);
		

		adachi.withdraw(200);					// 足立君が200円おろす
		
		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.getName());
		System.out.println("　口座番号：" + adachi.getNo());
		System.out.println("　預金残高：" + adachi.getBalance());
		System.out.println(adachi.toString());
		
	}
}
