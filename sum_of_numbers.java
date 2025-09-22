import java.util.*;
public class sum_of_numbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the numbers : ");
        int a = sc.nextInt();
        int sum = 0;
        while(a>0){
            int rem = a%10;
            sum += rem;
            a = a/10;


        }
        System.out.print("The sum of given numbers is : " + sum);
    }
    
}
