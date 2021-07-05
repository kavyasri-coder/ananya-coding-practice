package in.kavyasri.udemy.sorting_techniques;

public class BubbleSort {
    public static void main( String[] args ) {
        BubbleSort bubble = new BubbleSort();
        int[] arr = {52,4,2,78,34,29};
        bubble.bubbleSort(arr);
    }
    public void bubbleSort(int[] arr){
        for(int i=arr.length-1;i>0;i--){

            for(int j=0;j<i;j++){

                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
