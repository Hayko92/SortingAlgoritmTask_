public class SortingAlgoritmUtil {
    private SortingAlgoritmUtil() {
    }

    public static void insertionSort(Comparable[] comparableObjects) {
        for (int i = 1; i < comparableObjects.length; i++) {
            Comparable currentObject = comparableObjects[i];
            int j = i - 1;
            while (j >= 0 && comparableObjects[j].compareTo(currentObject) > 0) {
                comparableObjects[j + 1] = comparableObjects[j];
                j--;
            }
            comparableObjects[j + 1] = currentObject;
        }
    }

    public static int partition(Comparable[] objects, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (objects[i].compareTo(objects[pivot]) < 0) {
                swap(objects, counter, i);
                counter++;
            }
        }
        swap(objects, pivot, counter);
        return counter;
    }

    private static void swap(Comparable[] comparableObjects, int a, int b) {
        Comparable temp = comparableObjects[a];
        comparableObjects[a] = comparableObjects[b];
        comparableObjects[b] = temp;
    }

    public static void quickSort(Comparable[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

}
