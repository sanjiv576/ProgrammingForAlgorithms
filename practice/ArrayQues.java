public class ArrayQues{
    public static int[] removeArray(int a[], int pos, int size){

        for(int i = pos-1; i < size-1; i++){
            
            a[i] = a[i+1];
        }

        size--;
        return a;
    }

    public static void main(String[] args){

        int[] a= {100, 40, 200, 300, 400, 500};
        int pos = 2;
        int size = 5;

        ArrayQues.removeArray(a, pos, size);
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}