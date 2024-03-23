package Assignment_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        // Array to ArrayList
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(array);
        System.out.println("ArrayList from array: " + list);

        // ArrayList to Array
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(6, 7, 8, 9, 10));
        Integer[] newArray = arrayList.toArray(new Integer[0]);
        System.out.println("Array from ArrayList: " + Arrays.toString(newArray));
    }
}

