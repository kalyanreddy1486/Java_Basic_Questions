import java.util.Scanner;
public class primeNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        
        boolean isPrime = true;   

        if (a <= 1) {
            isPrime = false;     
        } else {
            for(int i = 2; i < a; i++){
                if(a % i == 0){
                    isPrime = false;
                    break;       
                }
            }
        }

        if(isPrime){
            System.out.print("prime number");
        } else {
            System.out.print("not a prime number");
        }
    }
}
