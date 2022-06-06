public class MergeSortExample {

    public int[] mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            // first/left half
            mergeSort(arr, start, mid);

            // second/right half
            mergeSort(arr, mid + 1, end);

            // calling merge operation

            merge(arr, start, mid, end);
        }

        return arr;
    }

    // create merge operation

    void merge(int[] arr, int start, int mid, int end) {

        // for left half
        // start, mid
        // mid - start + 1

        int a[] = new int[mid - start + 1];

        for (int indx = 0; indx < a.length; indx++) {
            a[indx] = arr[start + indx];
        }

        // for right half
        // mid+1, end
        // end - (mid+1) + 1 ==> end -mid
        int b[] = new int[end - mid];

        for (int indx = 0; indx < b.length; indx++) {
            b[indx] = arr[mid + 1 + indx];
        }

        int i = 0;
        int j = 0;
        int k = start;
        // same code for combine sorted two sort
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
                k++;
            } else {
                arr[k] = b[j];
                j++;
                k++;
            }
        }

        while (i < a.length) {
            arr[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            arr[k] = b[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {8, 1, 17, 9, 11};
        int start = 0;
        int end = arr.length-1;
        MergeSortExample m = new MergeSortExample();
        int result[] = m.mergeSort(arr, start, end);

        for(int i=0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
