
public class DVDPlayer implements ExPlayer{

	@Override
	public void play() {
		System.out.println("��DVD�Đ��J�n�I");
		
	}

	@Override
	public void stop() {
		System.out.println("��DVD�Đ��I���I");
		
	}

	@Override
	public void slow() {
		System.out.println("��DVD�X���[�Đ��J�n�I");
		
	}
	
}
