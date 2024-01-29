package homework;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 3, 4, 8, 10};
        int valueToFind = 3;
        Arrays.sort(numbers);
        System.out.printf("Index = %d%n", binarySearch(numbers, valueToFind, 0, numbers.length - 1));
    }

    private static int binarySearch(int[] sortedArray, int valueToFind, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                high = mid - 1;
            } else if (sortedArray[mid] == valueToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }
}