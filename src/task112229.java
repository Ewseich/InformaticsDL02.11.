import java.util.Scanner;
public class task112229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int del = 1;
        int summ = 0;
        while (del < n) {
            if (n % del == 0) {
                summ += del;
            }
            del++;

        }
        del = 1;
        if (summ == n) {
            while (del < n) {
                if (n % del == 0) {
                    System.out.print(del + " ");
                }
                del++;
            }
        }
        else {
            System.out.println(0);
        }

    }
}
