import java.util.*;
public class arrayunion {
    static ArrayList<Integer> findunion(int[] arr1, int[] arr2, int m, int n){
        HashSet<Integer> s  = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();
        for(int i=0;i<m;i++){
            s.add(arr1[i]);
        }
        for(int i=0;i<n;i++){
            s.add(arr2[i]);
        }
        for(int it:s){
            union.add(it);
        }
        return union;
    }
    public static void main(String[] args) {
        arrayunion ob = new arrayunion();
        arrayunion ob1 = ob;
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        ArrayList<Integer> union = ob.findunion(arr1, arr2, arr1.length, arr2.length);
        System.out.println(union);
    }
}
