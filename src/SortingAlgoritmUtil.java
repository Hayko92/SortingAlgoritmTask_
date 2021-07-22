import java.util.List;

public class SortingAlgoritmUtil {
    private SortingAlgoritmUtil() {
    }


    public static <T extends Comparable<T>> void insertionSort(List<T> comparableObjects) {
        for (int i = 1; i < comparableObjects.size(); i++) {
            T currentObject = comparableObjects.get(i);
            int j = i - 1;
            while (j >= 0 && comparableObjects.get(j).compareTo(currentObject) > 0) {
                comparableObjects.set(j + 1, comparableObjects.get(j));
                j--;
            }
            comparableObjects.set(j + 1, currentObject);
        }
    }

    public static <T extends Comparable<T>> int partition(List<T> objects, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (objects.get(i).compareTo(objects.get(pivot)) < 0) {
                swap(objects, counter, i);
                counter++;
            }
        }
        swap(objects, pivot, counter);
        return counter;
    }

    private static <T extends Comparable<T>> void swap(List<T> comparableObjects, int a, int b) {
        T temp = comparableObjects.get(a);
        comparableObjects.set(a, comparableObjects.get(b));
        comparableObjects.set(b, temp);
    }

    public static <T extends Comparable<T>> void quickSort(List<T> array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

}
