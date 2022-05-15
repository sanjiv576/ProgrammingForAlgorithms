
class InsertElementFull {
    public static int[] insertElement(int[] array, int pos, int data, int size){
        int anotherArray[] = {0,0,0,0,0,0};
        for(int i=0; i<anotherArray.length; i++){
            if (i == 0){
                anotherArray[i] = array[i];
            }

            else if (i == pos-1) {
                anotherArray[i] = data;
            }

            else {
                anotherArray[i] = array[i-1];
            }
        }

        return anotherArray;
    }
    public static void main(String[] args){
        int[] array = {100, 200, 300, 400, 500};
        int pos = 2;
        int data = 30;
        int size = 5;
        System.out.println("Before inserting in the full array: ");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        int[] newArray = InsertElementFull.insertElement(array, pos, data, size);
        System.out.println("After inserting in the full array: ");
        for(int i=0; i<newArray.length; i++){
            System.out.println(newArray[i]);
        }
    }
    
}
