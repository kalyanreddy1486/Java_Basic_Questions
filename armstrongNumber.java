import java.util.*;
public class armstrongNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number : ");
        int a = sc.nextInt();
        int c = a;
        int lenA = String.valueOf(a).length();
        int rev = 0;

        while(a>0){
            int rem = a%10;
            rev += Math.pow(rem,lenA);
            a = a/10;
        }
        if(c==rev){
            System.out.print("The given number is a Armstrong number");
        }
        else{
            System.out.print("The given number is not a Armstrong number");
        }
        
    }
}
