import java.util.Scanner;

public class prac_04_15 {
	public static void main(String[] args) {

        Scanner stdln = new Scanner(System.in);

        int sta;
        do {
            System.out.print("何cmから：");
            sta = stdln.nextInt();
        } while (sta <= 0);

        int sto;
        do {
            System.out.print("何cmまで：");
            sto = stdln.nextInt();
        } while (sto <= 0 && sto >= sta);

        int n;
        do {
            System.out.print("何cmごと：");
            n = stdln.nextInt();
        } while (n <= 0);


        System.out.println("身長 標準体重");      

        for (int i=sta; i <= sto; i+=n){
            double weight = (i-100)*9.0/10;
            if(weight < 0){
                weight = 0;
            }
            System.out.print(i +"　"+ weight +"\n");
        }
    }
}