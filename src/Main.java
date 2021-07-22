import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Comparable[] objects = new Comparable[15];
        for (int i = 0; i < 15; i++) {
            objects[i] = new ComparableObj(random.nextInt(100));
        }
        System.out.println("before sorting: " + Arrays.toString(objects));
        SortingAlgoritmUtil.insertionSort(objects);
        System.out.println("after sorting: " + Arrays.toString(objects));
        SortingAlgoritmUtil.quickSort(objects, 0, objects.length - 1);
        System.out.println("after sorting: " + Arrays.toString(objects));

    }
}
