import java.util.*;

public class CollectionMethodsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        // Collections.addAll() method
        Collections.addAll(arr, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("The Array is:\n");
        System.out.println(arr);
        sc.close();
    }
}
