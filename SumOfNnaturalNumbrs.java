import java.util.Scanner;
public class SumOfNnaturalNumbrs {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Nummber : ");
   
        int x = sc.nextInt();
        int y = 0;
        for(int i = 1 ; i<=x; i++){

            y += i;

        }
        System.out.println("Sum of N natural numbers : " + y);


    
    

    }
}


    

