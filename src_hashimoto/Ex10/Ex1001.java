
public class Ex1001 {

	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();

		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());

		System.out.println("Id.counter = " + Id.counter);

		System.out.println("a.counter = " + a.counter);
		System.out.println("b.counter = " + b.counter);

		System.out.println("maxId = " + Id.getMaxId());

	}
}