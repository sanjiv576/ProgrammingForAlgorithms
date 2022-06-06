
// 2D array implementation and traverse

public class Imp {

    public static void main(String[] args){
        // int row = 2;
        // int col = 3;
        // int arr[][] = new int[2][3];

        int arr[][] = {{10,20,30}, {40, 50, 60}};

       for (int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr[i].length; j++){
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
    }
    
}
