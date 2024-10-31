import java.util.Scanner;//измените переменную
public class task3063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int p = sc.nextInt();
        int y = sc.nextInt();
        int year = 0;
        while (x < y) {
            x += x / 100 * p;
            x = (int)(x * 100);
            x /= 100;
            year += 1;
        }
        System.out.println((int)year);

    }
}