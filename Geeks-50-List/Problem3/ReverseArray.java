import java.util.*;

class ReverseArray {
    public static String ReverseArray(int N, String arr) {
        if (arr.length() != (N + (N - 1))) {
            return "Array size mismatch";
        }
        if (N < 1) {
            return "";
        } else {
            StringBuilder result = new StringBuilder();
            result.append(arr);
            result.reverse();
            return "Reversed Array is " + result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int N = sc.nextInt();
                sc.nextLine();
                String arr = sc.nextLine();
                System.out.println(ReverseArray(N, arr));
            }
        } catch (Exception E) {
            System.out.println("The program didnt executed because of " + E);
        }
    }
}