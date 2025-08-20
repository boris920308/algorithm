import java.util.Arrays;
import java.util.Collections;

public class Basic {
    public static void main(String[] args) {
        ascendingSort();
        descendingSort1();
    }

    private static void ascendingSort() {
        int[] A = {4, 3, 5, 2, 1};
        Arrays.sort(A); // 오름차순 정렬
        System.out.println(Arrays.toString(A));
    }

    private static void descendingSort1() {
        Integer[] A = {5, 4, 3, 2, 1};
        Arrays.sort(A, Collections.reverseOrder()); // 내림차순 정렬
        System.out.println(Arrays.toString(A));
    }
}


