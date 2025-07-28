import java.util.*;
public class removeduplicates{
    static int removeDuplicates(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int k= set.size();
        System.out.println("size: "+k);
        int j = 0;
        for(int x:set){
            arr[j++] = x;
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("the fresh array is:");
        int k = removeDuplicates(arr);
        for(int i=0; i<k; i++){
            System.out.print(arr[i]+" ");

        }
    }

}
