
public class Period {
	private Day from;
	private Day to;
	
	//�R���X�g���N�^
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
		return from.toString() + "����" +  to.toString() + "�܂�";
	}
	
	//���t�̕ύX�@�I������ς���Ȃ�true,�J�n����ς���Ȃ�false
	public void changeDay(boolean changeTo, Day day) {
		if(changeTo) {
			System.out.println("�I������" + this.to + "����" + day + "�ɕύX���܂����B");
			setTo(day);
		}else{
			System.out.println("�J�n����" + this.to + "����" + day + "�ɕύX���܂����B");
			setTo(day);
		}
	}
	
	public void addToOneMonth() {
		System.out.println("�I������31���������܂��B");
		to.nextNDay(31);
	}
}
