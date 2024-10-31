import java.util.Scanner;
public class task112210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i1 = 0;
        int chsl = 0;
        int len = 0;
        int kol = 0;
        for (int i = a; i <= b; i++) {
            i1 = i;
            while (i1 > 0) {
                i1 /= 10;
                len++;
            }
            i1 = i;
            while (i1 > 0) {
                chsl += Math.pow(i1 % 10, len);
                i1 /= 10;
            }
            if (chsl == i) {
                System.out.print(chsl + " ");
                kol += 1;
            }
            chsl = 0;
            len = 0;
        }
        if (kol <= 0) {
            System.out.println(-1);
        }
    }
}
