import java.util.*;
public class hash {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] hash = new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
        int q;
        System.out.println("enter q");
        q = sc.nextInt();
        while(q--!=0){
            System.out.println("enter number");
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }
    }
}
