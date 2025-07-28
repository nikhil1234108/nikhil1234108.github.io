import java.util.*;
public class countof012 {
    public static ArrayList<Integer> sortarray(ArrayList<Integer> arr, int n){
        int cnt0=0, cnt1=0, cnt2=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)==0) cnt0++;
            else if(arr.get(i)==1) cnt1++;
            else cnt2++;
        }
        for(int i=0;i<cnt0;i++) arr.set(i,0);
        for(int i=cnt0;i<cnt0+cnt1;i++) arr.set(i,1);
        for(int i=cnt0+cnt1;i<n;i++) arr.set(i,2);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> arr1 = sortarray(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr1.get(i)+" ");
        }
    }
}
