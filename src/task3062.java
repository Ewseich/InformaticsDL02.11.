import java.util.Scanner;
public class task3062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int y = sc.nextInt();
        int day = 1;
        while (x < y) {
            x *= 1.1;
            day += 1;
        }
        System.out.println((int)day);

    }
}
