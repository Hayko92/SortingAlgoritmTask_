public class SortingAlgoritmUtil {
    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > currentNumber) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = currentNumber;
        }
    }

    public static int partition(int[] numbers, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (numbers[i] < numbers[pivot]) {
                int temp = numbers[counter];
                numbers[counter] = numbers[i];
                numbers[i] = temp;
                counter++;
            }
        }
        int temp = numbers[pivot];
        numbers[pivot] = numbers[counter];
        numbers[counter] = temp;
        return counter;
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            int minId = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    minId = j;
                }
                int temp = numbers[i];
                numbers[i] = min;
                numbers[minId] = temp;
            }
        }
    }
}
