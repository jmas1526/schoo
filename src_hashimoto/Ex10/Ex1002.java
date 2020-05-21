
public class Ex1002 {

	public static void main(String[] args) {
		ExId a = new ExId();
		ExId b = new ExId();

		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());

		System.out.println("ExId.counter = " + ExId.counter);

		System.out.println("a.counter = " + a.counter);
		System.out.println("b.counter = " + b.counter);

		System.out.println("maxId = " + ExId.getMaxId());

		int n = 6;

		ExId.setN(n);

		System.out.println("n = " + ExId.getN());

		ExId c = new ExId();
		ExId d = new ExId();

		System.out.println("cの識別番号：" + c.getId());
		System.out.println("dの識別番号：" + d.getId());

		System.out.println("ExId.counter = " + ExId.counter);

		System.out.println("c.counter = " + c.counter);
		System.out.println("d.counter = " + d.counter);

		System.out.println("maxId = " + ExId.getMaxId());

	}
}