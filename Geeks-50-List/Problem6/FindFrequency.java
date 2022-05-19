import java.util.Scanner;
import java.util.Vector;

public class FindFrequency {
    public static int findFrequency(Vector vector, int element) {
        int frequency = 0;
        while (vector.iterator().hasNext()) {
            if (vector.iterator().next().equals(element))
                frequency++;
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Vector vector = new Vector(size);
        for (int i = 0; i < size; i++) {
            vector.add(sc.nextInt());
        }
        int element = sc.nextInt();
        System.out.println(findFrequency(vector, element));
    }
}
