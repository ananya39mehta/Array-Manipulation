package Assignment_2;

public class NearestNumbers {
    public static int findNearestIndex(int[] arr) {
        if (arr.length < 2) {
            return -1; // Not enough elements
        }

        int minDiff = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 7, 15, 20, 25};
        int index = findNearestIndex(numbers);
        System.out.println("Index of the first number: " + index);
    }
}
