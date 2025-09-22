import java.util.Scanner;

public class GCd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int x = sc.nextInt();
        System.out.print("Enter num2 : ");
        int y = sc.nextInt();
        int min = (x<y)?x:y;
        int gcd = 1;
        for(int i = 1 ; i<=min ; i++){
            if(x%i ==0 && y%i==0){
                gcd = i;

            }
            
        }
        System.out.print("The GCD of the tow number : " + gcd);


    }
    
}
