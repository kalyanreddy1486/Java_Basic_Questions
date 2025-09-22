import java.util.*;
public class Reverse_a_number {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        int rev = 0;
        while(a>0){
            int rem = a%10;
            rev = rev*10+rem;
            a = a/10;
        
        
            
           

        }
        System.out.print("reverse of number is : " +  rev);

    }
}
