import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class stringpalindrome {
    static private boolean isPalindrome(String str) {
        int left = 0, right = str.length()-1;
        while(left<right){
            char l = str.charAt(left), r = str.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
            }
            else if(!Character.isLetterOrDigit(r)){
                right--;
            }
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                return false;
            }
            else {
                left++;
                right--;
            }

        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);
    }

}
