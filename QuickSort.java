public class QuickSort {

    public static void printArray(int arr[]) {

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
         System.out.println();
    }

    public static void quickSort(int arr[], int si ,int ei){
        //Base Case
        if(si>= ei){
            return;
        }

        //last element 
        int pIndx = parrtition(arr,si,ei);
        quickSort(arr,si,pIndx-1);
        quickSort(arr,pIndx+1, ei);
    }

    public static int  parrtition(int arr[], int si , int ei) {
        int pivot = arr[ei];
        int i = si-1;
        for(int j =si;j<ei;j++){
            if(arr[j]<= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]=temp;

            }
        }
        i++;
                //swap
                int temp = pivot;
                arr[ei]= arr[i];
                arr[i]=temp;

                return i;   
    }

    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8,};
        quickSort(arr, 0,arr.length-1);
        printArray(arr);
    }
    
}
