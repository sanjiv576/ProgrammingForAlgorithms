

// Delete any elment at any point of array
class DeleteElement {

    public static int[] removeElement(int[] array, int pos, int size){
        for(int i=pos-1; i<size-1; i++){
            array[i] = array[i+1];
        }
        size--;
        return array;
    }
    public static void main(String[] args){
        int[] array = {100, 40, 200, 300, 400};
        System.out.println("Before removing element in the array");
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
        int pos = 2;
        int size = 5;
        int[] newArray = DeleteElement.removeElement(array, pos, size);
        System.out.println("After removing element: ");
        for(int i=0; i<newArray.length; i++){
            System.out.println(newArray[i]);
        }
    }
    
}
