import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<ComparableObj> objects = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            objects.add(new ComparableObj(random.nextInt(100)));
        }
        System.out.println("before sorting: " + objects);
        SortingAlgoritmUtil.insertionSort(objects);
        System.out.println("after sorting: " + objects);
        SortingAlgoritmUtil.quickSort(objects, 0, objects.size() - 1);
        System.out.println("after sorting: " + objects);

    }
}
