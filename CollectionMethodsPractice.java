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

        // Collections.max() and Collections.min()

        System.out.println("The ArrayList is " + arr);
        int max = Collections.max(arr);
        int min = Collections.min(arr);
        System.out.println("The max element is " + max);
        System.out.println("The min element is " + min);

        // Collections.replaceAll()

        Collections.replaceAll(arr, 46, 455);
        System.out.println("The replaced ArrayList is " + arr);

        // Collections.binarySearch()
        Collections.sort(arr);
        int index = Collections.binarySearch(arr, 3);
        System.out.println("The array is" + arr);
        System.out.println("The position of the searched element is " + index);

        // Collections.frequency()
        int freq = Collections.frequency(arr, 58);
        System.out.println("The freq is " + freq);
        sc.close();
    }
}
