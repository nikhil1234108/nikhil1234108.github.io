import java.util.*;
public class Lcommonsubarray {
    static int Sumofcommonsubarray(int[] arr,long k){
        int n = arr.length;
        int len=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        long k = sc.nextLong();
        System.out.println(Sumofcommonsubarray(arr,k));
    }
}
