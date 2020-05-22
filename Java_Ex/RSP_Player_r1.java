
public abstract class RSP_Player_r1 {
	public static final String[] hand = {"�O�[","�`���L","�p�["};
	public static final int rock = 0;
	public static final int scissors = 1;
	public static final int paper = 2;
	private String playerName;
	private int playerId;
	private static int counter = 0;
	
	enum Result{
		win("����"),
		lose("����"),
		draw("������");
		private String label;
		
		Result(String label){
			this.label = label;
		}
		public String getLabel() {
			return this.label;
		}
	}
	
	
	
	public RSP_Player_r1(String name) {
		playerName = name;
		playerId = counter++;
	}
	
	public String getHand(int i) {
		return hand[i];
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public int getPlayerId() {
		return playerId;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public abstract int chooseHand();
	
	public static int play(int a, int b) {
		try {
			switch((a - b + 3) % 3) {
			case 0:
				return 0;//������
			case 1:
				return -1; //b�̏���
			case 2:
				return 1; //a�̏���
			default:
				System.out.println("play�ŗ\�����ʃG���[");
				throw new RuntimeException("�����default�ɔ����܂���");
			}
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("play(hand)�̃G���[�H", e);
		}
	}
	public static int play(RSP_Player_r1 a, RSP_Player_r1 b) {
		try {
			switch(play(a.chooseHand(), b.chooseHand())) {
			case 0:
				return -1;
			case -1:
				return b.getPlayerId();
			case 1:
				return a.getPlayerId();
			default:
				System.out.println("play�ŗ\�����ʃG���[");
				throw new RuntimeException("�����default�ɔ����܂���");
			}
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("play(Player)�̃G���[�H", e);
		}
	}
	
	
}
