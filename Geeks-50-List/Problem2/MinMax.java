import java.util.*;

class MinMax {
    public static String findMinMax(int[] arr, int size) {
        if (size > 0) {
            Arrays.sort(arr);
            return ("are " + arr[size - 1] + " and " + arr[0]);
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
            System.out.println("Maximum and minimum elements " + findMinMax(arr, size));
        } catch (Exception E) {
            System.out.println("The program didnt executed because of " + E);
        }
    }
}