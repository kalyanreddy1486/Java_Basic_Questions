import java.util.*;
public class countDigits {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter you numbers : ");
        int a = sc.nextInt();
        int c = String.valueOf(a).length();
        System.out.println("The count of numbers is : " + c);
    }
    
}
