
// insert element at point of arary
public class insertElement {
    
    public static int[] dataInsertion(int array[], int pos, int data, int size){
        for(int i = size; i > pos-1; i--){
            array[i] = array[i-1];
        }

        array[pos-1] = data;

        return array;
    }

    public static void main(String[] args){

        int array[] = {100,200,300,400, 0};
        int pos = 2;
        int data = 40;
        int size = 4;
        System.out.println("Before inserting in the array: ");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        int[] newArray = insertElement.dataInsertion(array, pos, data, size);
        System.out.println("After inserting in the array: ");
        for(int i=0; i<newArray.length; i++){
            System.out.println(newArray[i]);
        }
        
    }
}
