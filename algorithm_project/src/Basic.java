import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        ascendingSort();
    }

    private static void ascendingSort() {
        int[] A = {4, 3, 5, 2, 1};
        Arrays.sort(A); // 오름차순 정렬
        System.out.println(Arrays.toString(A));
    }
}


