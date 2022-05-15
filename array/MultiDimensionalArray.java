public class MultiDimensionalArray {
    public static void main(String[] args){
        
        int[][] arr = { {2,31,1,34}, {23,4,11,33}}; 

        for(int i = 0; i<2; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        

        
    }
}
