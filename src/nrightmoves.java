import java.util.*;

public class nrightmoves {
    static void rotateright(int[] arr, int k, int n) {
        if (n == 0) return;
        k = k % n;
        if (k == 0) return;

        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i - (n - k)] = arr[i];
        }

        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        rotateright(arr, k, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
