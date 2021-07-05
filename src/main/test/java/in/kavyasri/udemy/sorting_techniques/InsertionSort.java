package in.kavyasri.udemy.sorting_techniques;

public class InsertionSort {
    public static void main( String[] args ) {
        InsertionSort insert = new InsertionSort();
        int[] arr = {52,4,2,78,34,29};
        insert.insertionSort(arr);
    }
    public void insertionSort(int[] arr){

        for(int i=1;i< arr.length;i++){
            int k = arr[i];
            int j=i;
            while(j>0 && arr[j-1]>k){
                arr[j] = arr[j-1];
                j=j-1;
            }
            arr[j] = k;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
