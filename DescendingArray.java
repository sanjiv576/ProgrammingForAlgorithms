public class DescendingArray {
    int[] sort(int[] array){
        boolean swap = true;
        while (swap) {
            swap = false;
            for(int i= 0; i<array.length; i++){
                if(array[i] < array[i+1]) {
                    array[i] = array[i+1];
                    array[i+1] = array[i];
                    swap = true;
                }
            }
        }
        return array;
    }

    public static void main(String[] args){
        DescendingArray obj = new DescendingArray();
        int[] array = {4,6,3,12,5};
        int[] sortedArray = obj.sort(array);
        for(int i=0; i<sortedArray.length; i++){
            System.out.println(sortedArray[i]);
        }
    }
}
