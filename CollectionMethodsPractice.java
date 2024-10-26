import java.util.*;

public class CollectionMethodsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        // Collections.addAll() method
        Collections.addAll(arr, 1, 262, 3, 34, 51, 46, 7, 58, 9, 10);
        System.out.println("The Array is:\n");
        System.out.println(arr);

        // Collections.sort()
        Collections.sort(arr);
        System.out.println("The sorted list is " + arr);

        // Collections.reverse()
        Collections.reverse(arr);
        System.out.println(arr);
        sc.close();
    }
}
