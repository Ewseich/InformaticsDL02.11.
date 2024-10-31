import java.util.Scanner;
public class task112211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i1 = 0;
        int chisl = 0;
        int step = 1;
        int kol = 0;
        for (int i = a; i <= b; i++) {
            i1 = i;
            while (i1 != 0) {
                chisl = (int)(i*i % Math.pow(10, step));
                i1 = i1 / 10;
                step++;
            }
            if (i == chisl) {
                System.out.print(i + " ");
                kol++;
            }
            step = 1;
        }
        if (kol == 0) {
            System.out.println(-1);//такой иф можно запихать в одну строчку разными способами
        }
    }
}
