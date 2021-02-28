import java.util.ArrayList;
import java.util.Scanner;

public class LCM {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //1> Enter the 2 numbers :
        System.out.println("Enter 2 number and split them with ',' , ex: 1,1 ");
        System.out.print("Enter : ");
        ArrayList<Integer> nums = new ArrayList<>();
        String[] numStr = sc.nextLine().split(","); 

        for (int i = 0; i < numStr.length; i++) {
            nums.add(Integer.parseInt(numStr[i]));
        }

        //2> Comparing size :
        if (nums.get(0) > nums.get(1)) {
            int temp = nums.get(0);
            nums.set(0,nums.get(1));
            nums.set(1,temp);
        }

        //3> Find GCD :
        int GCD = 0;
        for (int i = nums.get(0); i > 0 ; i--) {
            if(nums.get(0) % i == 0){
                if (nums.get(1) % i == 0) {
                    GCD = i;
                    break;
                }
            }
        }

        //3> Find LCM :
        int LCM = 0;
        for (int i = 1; ; i++) {
            if((GCD* i)% nums.get(0) == 0 && (GCD* i)% nums.get(1) == 0){
                LCM = GCD* i;
                break;
            }
        }

        //4> Output :
            System.out.println("The LCM of "+ nums+ " is " + LCM);
    }
}
