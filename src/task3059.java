import java.util.Scanner;
public class task3059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answ = 1;
        double step = 1.0;
        while (answ <= n) {
            System.out.print(answ + " ");
            answ = (int)Math.pow(2, step);
            step++;
        }
    }
}
