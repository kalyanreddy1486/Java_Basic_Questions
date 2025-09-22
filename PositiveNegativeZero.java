import java.util.*;
public class PositiveNegativeZero {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("positive");
        }
        else if(a<0){
            System.out.println("negative");
        }
        else{
            System.out.println("Zero");
        }

    }
    
}
