package in.kavyasri.udemy.sorting_algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selection = new SelectionSort();
        int[] arr = {52,4,2,78,34,29};
        selection.selectionSort(arr);
    }

    public void selectionSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            int l = 0;
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[l]) {
                    l = j;
                }
            }
            int temp = arr[l];
            arr[l] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
