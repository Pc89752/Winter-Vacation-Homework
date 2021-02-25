/**
 * EvenOrOdd
 */
import java.util.Scanner;

public class EvenOrOdd {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("What is the number ? : ");
        int num = sc.nextInt();
        System.out.print(num + " is " );
        System.out.print(num%2 == 1 ? "Odd" : "Even");
    }
}