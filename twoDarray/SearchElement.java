import java.util.Scanner;

// searching an element in 2D array

public class SearchElement {

    public static String searchVal(int arr[][], int searchValue){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if (searchValue == arr[i][j]){
                    return "Found";
                }
            }
        }
        return "Not found";
    }
    public static void main(String[] args){
        System.out.println("Enter an element to be searched: ");
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,2,3}, {4,5,6}};

        int searchValue = sc.nextInt();
        System.out.println(SearchElement.searchVal(arr, searchValue));
        
    }
}
