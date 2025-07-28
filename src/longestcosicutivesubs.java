import java.util.*;
public class longestcosicutivesubs {
    public static boolean linearsearch(int[] arr, int num){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==num) return true;
        }
        return false;

    }
    public static int consicutivenumber(int[] arr){
        int n=arr.length;
        int longest=1;
        for(int i=0;i<n;i++){
            int x=arr[i];
            int cnt=1;
            while(linearsearch(arr,x+1)==true){
                x+=1;
                cnt+=1;
            }
            longest=Math.max(longest,cnt);
        }
        return longest;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(consicutivenumber(arr));
    }
}
