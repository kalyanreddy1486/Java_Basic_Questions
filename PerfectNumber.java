import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = sc.nextInt();

        int x = 0;
        for (int i = 1; i <= a - 1; i++) {
            if (a % i == 0) {
                x += i;
            }
        }

        if (x == a) {
            System.out.println(a + " is a Perfect Number");
        } else {
            System.out.println(a + " is NOT a Perfect Number");
        }

        sc.close();
    }
}
