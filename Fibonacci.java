import java.util.Scanner;
public class Fibonacci{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the  number for Fibonacci series you want to find : ");
        int a = sc.nextInt();
        int a1 = 0, a2 = 1;
        System.out.print(a1 + " " + a2 + " ");
        for(int i = 0;i<a;i++){
            int a3 = a1+a2;
            System.out.print(a3 + " ");
            a1 = a2;
            a2 = a3;
          
        }


    }
}