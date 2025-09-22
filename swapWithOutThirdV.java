import java.util.Scanner;

public class swapWithOutThirdV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		int c = a;
		a = b;
		b = c;
		System.out.println("------------------------");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}

}