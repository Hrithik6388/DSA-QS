 public class MergSort{

    public static void printArray(int arr[]){
    
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println( );
    } 

    public static void mergSort(int arr[],int si, int ei){
            //base Case
            if(si>=ei){
                return;
            }
            //kaam
            int mid = si+(ei - si)/2;
           mergSort(arr, si, mid); // leftside 
           mergSort(arr, mid+1, ei); // rightside 
           merg(arr, si,mid,ei);
    }

    public static void merg(int arr[], int si, int mid, int ei) {

        int temp []= new int[ei-si+1];
        int i = si; // 1st sorted part
        int j = mid+1; //2nd sorted part
        int k = 0; //for temp array idex
   
        // Comparing the both side (left & right)
        while(i<= mid && j<= ei){
            if(i <j){
                temp[k] = arr[i];
                i++;
            } else{

                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //if leftover of element 
        while(i <=mid){
            temp[k++]=arr[i++];
        }
        //if rightover of element
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //Copy temp arr 
        for( k=0, i=si;k<temp.length; k++, i++){
            arr[i]= temp[k];
        }

    }


    public static void main(String args[]) {
        int arr[] =  {6,3,9,5,2,8,};
        mergSort(arr, 0, arr.length-1);
        printArray(arr);
        
    }
}