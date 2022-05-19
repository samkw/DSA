import java.util.*;

class RandomSort {
    public static String SortArray(int N, int[] arr) {
        if (N == 1) {
            return Arrays.toString(arr);
        } else {
            Arrays.sort(arr);
            return Arrays.toString(arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Sorted Array is " + SortArray(size, arr));
        } catch (Exception E) {
            System.out.println("The program didnt executed because of " + E);
        }
    }
}