import java.util.*;

class KthSmallestElement {
    public static String findMin(int[] arr, int size, int K) {
        if (size > 0) {
            if (K > size) {
                return "error : position greater than size";
            } else {
                Arrays.sort(arr);
                return ("" + arr[K - 1]);
            }
        }
        return ("does not exist");
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            if (size > 0) {
                int K = sc.nextInt();
                System.out.println(K + "th minimum element is " + findMin(arr, size, K));
            } else {
                System.out.println("Exit : 0 size entered");
            }
        } catch (Exception E) {
            System.out.println("The program didnt executed because of " + E);
        }
    }
}