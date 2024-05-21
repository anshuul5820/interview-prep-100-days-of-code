public class InsertionSort {

    public static void insertionSort(int[] arr, int n){
        for(int i = 1; i < n-1; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 4};

        insertionSort(arr, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
