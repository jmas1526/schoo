import java.util.Random;

public class prac_03_17 {
	public static void main(String[] args) {

        Random rand = new Random();

        int x = rand.nextInt(3);

        switch(x){
            case 0: 
                System.out.println("グー");
                break;
            case 1: 
                System.out.println("チョキ");
                break;
            case 2: 
                System.out.println("パー");
                break;
        }
	}
}