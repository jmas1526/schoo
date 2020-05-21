
public abstract class RSP_Player {
	private String[] hand = {"�O�[","�`���L","�p�["};
	private String playerName;
	public static final int rock = 0;
	public static final int scissors = 1;
	public static final int paper = 2;
	
	public RSP_Player(String name) {
		playerName = name;
	}
	
	public String getHand(int i) {
		return hand[i];
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public abstract int chooseHand();
	
	public String play(RSP_Player vs) {
		switch((this.chooseHand() - vs.chooseHand() + 3) % 3) {
		case 0:
			return "�������ł��B";
		case 1:
			return vs.playerName + "�̏����ł��B";
		case 2:
			return this.playerName + "�̏����ł��B";
		default:
			return "�G���[";
		}
	}
}
