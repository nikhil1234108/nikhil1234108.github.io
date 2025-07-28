import java.util.*;
public class CountDigits {
    static int countdigits(int n){
        int count = (int)(Math.log(10)+1);
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countdigits(n));
    }
}
