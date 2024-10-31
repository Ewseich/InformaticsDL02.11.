import java.util.Scanner;
public class task1422 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long nn = n;
        long k = sc.nextInt();
        long kk = k;
        while (n * k != 0) {
            long s = Math.min(n, k);//используйте алгоритм с урока, а не мой
            n = Math.max(n, k) % Math.min(n, k);
            k = Math.abs(s);
        }
        System.out.println((nn * kk) / k);
    }

}
