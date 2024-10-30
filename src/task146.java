import java.util.Scanner;
public class task146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int chisl = a * d + c * b;
        int chisl1 = a * d + c * b;
        int znam = b * d;
        int znam1 = b * d;
        while (chisl * znam != 0) {
            int s = Math.min(chisl,znam);
            znam = Math.max(chisl,znam) % Math.min(chisl,znam);
            chisl = Math.abs(s);
        }
        if (chisl == 0) {
            chisl = znam1;
        }
        c = chisl1 / chisl;
        d = znam1 / chisl;
        System.out.println(c + " " + d);

    }
}
