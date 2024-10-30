import java.util.Scanner;

import static java.lang.System.exit;

public class task27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int aa = a;
        int b = sc.nextInt();
        int bb = b;
        while (a * b != 0) {
            int s = Math.min(a,b); //используйте алгоритм с урока, а не мой, пж
            b = Math.max(a,b) % Math.min(a,b);
            a = Math.abs(s);
        }
        if (a == 0) {
            a = bb;
        }
        int c = aa / a;
        int d = bb / a;
        System.out.println(c + " " + d);


    }
}
