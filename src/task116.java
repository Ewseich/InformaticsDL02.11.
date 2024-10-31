import java.util.Scanner;//измените переменную
public class task116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int srav;
        int min = 9;
        int max = 0;
        while (a > 0) {
            srav = a % 10;
            if (srav < min) {
                min = srav;
            }
            if (srav > max) {
                max = srav;
            }
            a /= 10;
        }
        System.out.println(min+ " " +max);
    }
}
