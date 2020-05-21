package Ex12;

public class Ex1202 {

	public static void main(String[] args) {

		Account taro = new Account("一郎", "123456", 2000);

		System.out.println("■一郎君の口座");
		System.out.println("　講座名義：" + taro.getName());
		System.out.println("　講座番号：" + taro.getNo());
		System.out.println("　預金残高：" + taro.getBalance());
		System.out.println("　識別番号：" + taro.getId());

		Account jiro = new Account("二郎", "654321", 5000);

		System.out.println("■二郎君の口座");
		System.out.println("　講座名義：" + jiro.getName());
		System.out.println("　講座番号：" + jiro.getNo());
		System.out.println("　預金残高：" + jiro.getBalance());
		System.out.println("　識別番号：" + jiro.getId());

		TimeAccount saburo = new TimeAccount("三郎", "987654", 1000, 4000);

		System.out.println("■三郎君の口座");
		System.out.println("　講座名義：" + saburo.getName());
		System.out.println("　講座番号：" + saburo.getNo());
		System.out.println("　普通預金残高：" + saburo.getBalance());
		System.out.println("　定期預金残高：" + saburo.getTimeBalance());
		System.out.println("　識別番号：" + saburo.getId());

		printResult(taro, jiro);
		printResult(taro, saburo);
		printResult(jiro, saburo);

	}

	static int compBalance(Account a, Account b) {
		long balanceA = a.getBalance();
		long balanceB = b.getBalance();

		if (a instanceof TimeAccount) {
			balanceA += ((TimeAccount) a).getTimeBalance();
		}
		if (b instanceof TimeAccount) {
			balanceB += ((TimeAccount) b).getTimeBalance();
		}

		if (balanceA > balanceB) {
			return 1;
		} else if (balanceA < balanceB) {
			return -1;
		} else {
			return 0;
		}
	}

	static void printResult(Account a, Account b) {
		String name1 = a.getName();
		String name2 = b.getName();

		System.out.printf("%s君と%s君の預金残高を比較します。\n", name1, name2);

		switch(compBalance(a, b)) {
		case 1:
			System.out.printf("→%s君のほうが預金残高が多い。\n", name1);
			break;
		case -1:
			System.out.printf("→%s君のほうが預金残高が多い。\n", name2);
			break;
		case 0:
			System.out.printf("→%s君と%s君の預金残高は同じ。\n", name1, name2);
			break;
		}
	}
}