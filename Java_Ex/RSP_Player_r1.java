
public abstract class RSP_Player_r1 {
	public static final String[] hand = {"グー","チョキ","パー"};
	public static final int rock = 0;
	public static final int scissors = 1;
	public static final int paper = 2;
	private String playerName;
	private int playerId;
	private static int counter = 0;
	
	enum Result{
		win("勝ち"),
		lose("負け"),
		draw("あいこ");
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
				return 0;//あいこ
			case 1:
				return -1; //bの勝ち
			case 2:
				return 1; //aの勝ち
			default:
				System.out.println("playで予期せぬエラー");
				throw new RuntimeException("分岐でdefaultに抜けました");
			}
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("play(hand)のエラー？", e);
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
				System.out.println("playで予期せぬエラー");
				throw new RuntimeException("分岐でdefaultに抜けました");
			}
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("play(Player)のエラー？", e);
		}
	}
	
	
}
