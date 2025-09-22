import java.util.*;
public class palindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        int c  = a;
        int rev = 0;
        while(a>0){
            int rem = a%10;
            rev = rev*10+rem;
            a = a/10;
        
        
            
           

        }
        if(c==rev){
            System.out.println("The given number is a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
       

    }
}
