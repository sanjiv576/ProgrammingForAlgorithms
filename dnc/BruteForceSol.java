// this is the alternate solution of finding maximum sum sub array, which time complexity is n*n
public class BruteForceSol {
    // Brute force algo
    static int findMax(int a[]){
        int max = -999999;
        int sum;
        for(int i = 0; i < a.length; i++){
            sum = 0;
            for(int j = i; j < a.length; j++){
                sum += a[j];

                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int a[] = {5, -2, 6, 7, -3};
        int result = BruteForceSol.findMax(a);
        System.out.println(result);
    }
}
