
// this  does not work
public class InsertEle {
    public static int[][] insert(int arr[][], int data, int row, int col){
        for(int i = arr[row].length; i > col-1; i--){
            arr[row][col] = arr[row][i-1];
        }
        arr[row][col-1] = data;

        return arr;
    }

    public static void printTwoDarray(int a[][]){
        for(int i = 0; i < a.length; i++ ){
            for(int j = 0; i < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[][] = {{1,2,3}, {4,6,}};

        int[][] newArr = InsertEle.insert(arr, 5, 1, 1);
        InsertEle.printTwoDarray(newArr);
    }
}
