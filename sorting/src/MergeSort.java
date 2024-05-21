import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void merge(int[] arr, int left, int mid, int right) {
        List<Integer> temp = new ArrayList<>();
        int l = left, r = mid + 1;

        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                temp.add(arr[l++]);
            } else {
                temp.add(arr[r++]);
            }
        }

        while (l <= mid) {
            temp.add(arr[l++]);
        }

        while (r <= right) {
            temp.add(arr[r++]);
        }

        for (int k = left; k <= right; k++) {
            arr[k] = temp.get(k - left);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 4};

        mergeSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}