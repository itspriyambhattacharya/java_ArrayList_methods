import java.util.*;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();// 1. declare an ArrayList in Java
        ArrayList<Integer> a1 = new ArrayList<>(5); // declaring an ArrayList with initial capacity
        arr.add(12); // 2. added an element at the end of ArrayList
        arr.add(13);
        arr.addFirst(7);
        arr.addLast(90);
        arr.add(1, 456);
        for (Integer elemInteger : arr) {
            System.out.println(elemInteger);
        }
    }
}