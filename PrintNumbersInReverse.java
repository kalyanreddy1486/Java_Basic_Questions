import java.util.Scanner;
public class PrintNumbersInReverse {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int x = sc.nextInt();
        for(int i = x ; i>=1 ; i--){
            System.out.print(" " + i);
        }


    }

}
