import java.util.*;
public class leftmove {
    static void solve(int[] arr,int n){
        int[] temp = new int[n];
        for(int i=1;i<n;i++){
            temp[i-1]=arr[i];
        }
        temp[n-1]=arr[0];
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        solve(arr,n);
    }
}
