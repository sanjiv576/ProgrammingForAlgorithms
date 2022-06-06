public class Sorting {
    public static void main(String[] args){
        int[] arr = {12,4,6,2,1,22};
       
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j <= i; j++){
                if (arr[i]< arr[j]){
                    arr[j] = arr[i];
                }
            
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
