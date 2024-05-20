import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++)
                if (a[min_index] > a[j])
                    min_index = j;

            int temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;
        }

        for (int i : a)
            System.out.println(i + " ");
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);


        System.out.println("enter length::");
        int n = ob.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = ob.nextInt();
        selectionSort(arr, n);

        System.exit(0);
    }
}
