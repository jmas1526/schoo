import java.util.Scanner;

public class prac_06_17 {
	public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int[][] a = new int[6][2];
        String[] s = {"国語", "数学"};

        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d人目\n", i+1);
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(s[j]+"：");
                a[i][j] = stdIn.nextInt();
            }
        }

        System.out.println("-----\n科目ごとの平均点");
        for (int i = 0; i  < a[0].length; i++) {
            double ave = 0;
            for (int j = 0; j < a.length; j++) {
                ave += a[j][i];
            }
            ave /= a.length;
            System.out.println(s[i]+"："+ave+"点");
        }

        System.out.println("学生ごとの平均点");
        for (int i = 0; i  < a.length; i++) {
            double ave = 0;
            for (int j = 0; j < a[i].length; j++) {
                ave += a[i][j];
            }
            ave /= a[i].length;
            System.out.println((i+1)+"人目："+ave+"点");
        }
    }
}