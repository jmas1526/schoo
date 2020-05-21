
public class Period {
	private Day from;
	private Day to;
	
	//コンストラクタ
	public Period(Day from, Day to) {
		this.from = new Day(from);
		this.to = new Day(to);
	}
	
	//getter,setter
	public Day getFrom() {
		return from;
	}
	public Day getTo() {
		return to;
	}
	public void setFrom(Day from) {
		this.from = from;
	}
	public void setTo(Day to) {
		this.to = to;
	}
	
	@Override
	public String toString() {
		return from.toString() + "から" +  to.toString() + "まで";
	}
	
	//日付の変更　終了日を変えるならtrue,開始日を変えるならfalse
	public void changeDay(boolean changeTo, Day day) {
		if(changeTo) {
			System.out.println("終了日を" + this.to + "から" + day + "に変更しました。");
			setTo(day);
		}else{
			System.out.println("開始日を" + this.to + "から" + day + "に変更しました。");
			setTo(day);
		}
	}
	
	public void addToOneMonth() {
		System.out.println("終了日を31日延長します。");
		to.nextNDay(31);
	}
}
