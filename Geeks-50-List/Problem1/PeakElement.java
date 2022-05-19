import java.util.*;

class PeakElement {
    public static int findPeak(int[] arr, int size) {
        if (size == 1) {
            return 0; // if array has only one element return the index
        } else {
            for (int i = 0; i < size; i++) {
                if (i == 0 && arr[i] > arr[i + 1]) {
                    return i;
                } // this is logic for 1st element
                else if (i == size - 1 && arr[i] > arr[i - 1]) {
                    return i;
                } // this is logic for last element
                else {
                    if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                        return i;
                    } // this logic is for middle elements
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            ;
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Peak Element is at index " + findPeak(arr, size));
        } catch (Exception E) {
            System.out.println("The program didnt executed because of " + E);
        }
    }
}