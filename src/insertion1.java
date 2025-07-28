import java.util.Scanner;
public class insertion1 {
    public static void insertion1(int[] arr, int n){
        for(int i=0;i<n;i++){
            int j = i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.err.println("The sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        insertion1(arr, n);
        sc.close();
    }
}