import java.util.Scanner;//измените переменную
public class task112214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last = -1;
        int yes = 0;
        while (n > 0) {
            if (n % 10 == last) {
                System.out.println("YES");
                yes += 1;
                break;
            }
            else {
                last = n % 10;
            }
            n /= 10;
        }
        if (yes == 0) {
            System.out.println("NO");//такой иф можно запихать в одну строчку разными способами
        }
    }
}
