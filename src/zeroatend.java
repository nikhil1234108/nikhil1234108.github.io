import java.util.*;
public class zeroatend {
    public static int[] movezeros(int n, int[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        int nz = temp.size();
        for(int i=0;i<nz;i++){
                arr[i]=temp.get(i);
            }
            for(int i = nz; i<n; i++){
                arr[i]=0;
            }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("zeroatend");
        int[] ans = movezeros(n, arr);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }


}
