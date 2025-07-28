import java.util.*;
public class quicksort {
    static int partition(List<Integer> arr, int low, int high){
        int pivot = arr.get(low);
        int i=low;
        int j=high;
        while(i<j){
            while(pivot>=arr.get(i) && i<=high-1){
                i++;
            }
            while(pivot<arr.get(j) && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
            }

        }
        int temp = arr.get(low);
        arr.set(low,arr.get(j));
        arr.set(j, temp);
        return j;
    }
    static void qs(List<Integer> arr, int low, int high){
        if(high<=low) return;
        int PIndex = partition(arr,low,high);
        qs(arr,low,PIndex-1);
        qs(arr,PIndex+1,high);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        quicksort.qs(arr,0,n-1);
        System.out.println("Sorted Array");
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
