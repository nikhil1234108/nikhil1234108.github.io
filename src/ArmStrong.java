import java.lang.Math;
import java.util.Scanner;

public class ArmStrong {
    public static boolean isArmStrong(int num) {
        int k = String.valueOf(num).length();
        int sum = 0;
        int n=num;
        while(n>0){
            int rem = n%10;
            sum += Math.pow(rem,k);
            n/=10;
        }
        return sum==num?true:false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isArmStrong(n)){
            System.out.println("ArmStrong");
        }
        else{
            System.out.println("Not ArmStrong");
        }
    }
}
