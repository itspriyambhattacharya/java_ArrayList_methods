import java.util.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();// 1. declare an ArrayList in Java
        ArrayList<Integer> a1 = new ArrayList<>(5); // declaring an ArrayList with initial capacity
        arr.add(12); // 2. added an element at the end of ArrayList
        arr.add(13);
        arr.addFirst(7);
        arr.addLast(90);
        arr.add(1, 456);
        for (Integer elemInteger : arr) {
            System.out.println(elemInteger);
        }
        System.out.println("ArrayList a2");
        a1.add(23);

        for (Integer elemInteger : a1) {
            System.out.println(elemInteger);
        }

        int elem = arr.get(1);// gets the element from the given index
        int e1 = arr.getFirst();
        int e2 = arr.getLast();
        System.out.println("Elem is " + elem);
        System.out.println("First element is " + e1 + "\nLast element is " + e2);

        System.out.println("Before: The array is:\n\n");
        for (Integer v : arr) {
            System.out.print(v + "\t");
        }
        System.out.println();
        arr.set(3, 345); // replaces the element at position '3' with the value '345'

        System.out.println("After: The array is:\n\n");
        for (Integer v : arr) {
            System.out.print(v + "\t");
        }
        System.out.println();

        arr.remove(4); // removing value from the specified index
        arr.remove(2); // removing value from the specified index

        System.out.println("After removing: The array is:\n\n");
        for (Integer v : arr) {
            System.out.print(v + "\t");
        }
        System.out.println();

        arr.addLast(34);
        arr.addLast(43);
        arr.addLast(343);
        System.out.println("After aadding elements at last of ArrayList: The array is:\n\n");
        for (Integer v : arr) {
            System.out.print(v + "\t");
        }
        System.out.println();
        arr.removeFirst(); // removing the first element
        arr.removeLast(); // removing the last element
        System.out.println("After removing first and last element: The array is:\n\n");
        for (Integer v : arr) {
            System.out.print(v + "\t");
        }
        System.out.println();
        arr.remove(Integer.valueOf(345)); // Removing the first occurance of the specified value

        System.out.println("After removing element from between: The array is:\n\n");
        for (Integer v : arr) {
            System.out.print(v + "\t");
        }
        System.out.println();

        int i = arr.indexOf(45);
        System.out.println("Index of 45 is " + i);
        System.out.println("Index of 34 is " + arr.indexOf(34)); // using indexOf() method
        System.out.println("Index of 456 is " + arr.indexOf(456));
        arr.add(456);
        arr.add(34);
        System.out.println("After adding 456 and 34 at end: The array is:\n\n");
        for (Integer v : arr) {
            System.out.print(v + "\t");
        }
        System.out.println();
        System.out.println("Last-index of 456 is " + arr.lastIndexOf(456)); // using lastIndexOf() method
        System.out.println("Last-index of 34 is " + arr.lastIndexOf(34));
        System.out.println("Contains " + arr.contains(34)); // using contains() method

        sc.close();
    }
}