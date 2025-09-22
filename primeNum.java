import java.util.Scanner;
public class primeNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your nuumber  : ");
        int a = sc.nextInt();
        for(int i = 2; i<=a-1 ; i++){
            if(a%i == 0){
                System.out.print("Its not a Prime Number ");
                break;
            }
            else{
                System.out.print("Prime number");
                break;
            }
        }
    }
    


    
}
