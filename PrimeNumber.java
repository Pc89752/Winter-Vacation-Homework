import java.util.Scanner;

public class PrimeNumber {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int CD = 0;
        System.out.print("Enter a number ? : ");
        int num = sc.nextInt();
        
        for (int i = 1; i < num/2 +1 && CD != 2; i++) {
            if(num % i == 0) CD++;
        }

        System.out.print(num);
        System.out.print(CD==1 ? " is " : " isn't ");
        System.out.println("a prime number .");
    }
}
