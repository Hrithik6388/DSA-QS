public class SelectionSort {

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int maxpos = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    maxpos = j;
                }

            }
            // sawp
            int temp = arr[maxpos];
            arr[maxpos] = arr[i];
            arr[i] = temp;

        }

    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        sort(arr);
        printarr(arr);
    }
}
