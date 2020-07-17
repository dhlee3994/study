package doIt.chap02;

public class Exam01_array {
    public static void main(String[] args) {
        int[] arr = {5, 10, 73, 2, -5, 42};
        int length = arr.length;
        for (int i = 0; i < length/2; i++) {
            swap(arr, i, (length-1) - i);

            for (int j = 0; j < length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.printf("\narr[%d]와 arr[%d]를 교환합니다.\n", i, length-1-i);
        }
    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }


}
