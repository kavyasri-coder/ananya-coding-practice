package in.kavyasri.udemy.sorting_techniques;

public class ShellSort {
    public static void main( String[] args ) {
        ShellSort s = new ShellSort();
        int[] arr = {52,4,2,78,34,29};
        s.shellSort(arr);
    }

    public void shellSort(int[] arr){

        for(int gap=arr.length/2;gap>0;gap/=2) {
            for(int i=gap;i<arr.length;i++) {
                int n = arr[i];
                int j=i;
                while(j>=gap && arr[j-gap]>n) {
                    arr[j] = arr[j-gap];
                    j = j - gap;
                }
                arr[j] = n;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
