import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[15];
        for (int i = 0; i < 15; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("before sorting: " + Arrays.toString(numbers));
        SortingAlgoritmUtil.insertionSort(numbers);
        System.out.println("after sorting: " + Arrays.toString(numbers));
        SortingAlgoritmUtil.quickSort(numbers, 0, numbers.length - 1);
        System.out.println("after sorting: " + Arrays.toString(numbers));
        SortingAlgoritmUtil.selectionSort(numbers);
        System.out.println("after sorting: " + Arrays.toString(numbers));
        System.out.println("=========================================");
    }
}
