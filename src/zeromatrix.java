import java.util.*;
public class zeromatrix {
    public static ArrayList<ArrayList<Integer>> zeromatrix(ArrayList<ArrayList<Integer>> matrix, int m,int n){
        int[] col=  new int[m];
        int[] row=new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix.get(i).get(j)==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                if(row[i]==1 || col[j]==1){
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,2,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,1,2)));
        matrix.add(new ArrayList<>(Arrays.asList(2,2,2)));
        int n = matrix.size();
        int m = matrix.get(0).size();
        ArrayList<ArrayList<Integer>> zeromatrix = zeromatrix(matrix,n,m);
        System.out.println("the matrix is");
        for(ArrayList<Integer> row:zeromatrix){
            for(Integer i:row){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}

