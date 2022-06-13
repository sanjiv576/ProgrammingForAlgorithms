// how to merge and sort two sorted arrays ?

public class CombineMergeSort {

    public int[] merge(int[] a, int[] b) {

        int i = 0;
        int j = 0;
        int k = 0;
        int c[] = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }

        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }

    public static void main(String[] args){
        int[] b = {7,9, 11, 15};
        int[] a = {2, 3, 8,10,44};
        CombineMergeSort com =  new CombineMergeSort();
        int[] mergedSort = com.merge(a, b);
        for (int i = 0; i < mergedSort.length; i++){
            System.out.print(mergedSort[i] + " ");
        }
        System.out.println();
        
        
    }

}
