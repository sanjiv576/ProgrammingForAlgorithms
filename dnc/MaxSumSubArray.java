

public class MaxSumSubArray {
    public int FindMaxSumSubArray(int a[], int start, int end){
        if(start == end){
            return a[start];
        }
        else {
            int mid = (start+end)/2;
            int leftMax = 0;
            int rightMax = 0;

            // left half of the array
            leftMax = FindMaxSumSubArray(a, start, mid);

            // right half of the array
            rightMax = FindMaxSumSubArray(a, mid+1, end);

            // now calculating cross section max
            int sum = 0;
            int lmax = -999999;

            // this is max for the left side of cross max
            
            for(int i = mid; i >= 0; i--){
                sum += a[i];
                if(sum > lmax){
                    lmax=sum;
                }
            }

            // this is max for the right side of cross max
            sum = 0;
            int rmax = -999999;
            for(int j = mid+1; j < a.length; j++){
                sum += a[j];
                if(sum > rmax){
                    rmax = sum;
                }
            }

            int crossMax = rmax + lmax;

            if((crossMax > leftMax) && (crossMax > rightMax)){
                return crossMax;
            }
            else if((leftMax > crossMax) && (leftMax > rightMax)){
                return leftMax;
            }
            else {
                return rightMax;
            }
            // return Math.max(crossMax, leftMax, rightMax);
        }
        
    }

    public static void main(String[] args){
        int a[] = {5, -2, 6, 7, -3};
        int start = 0;
        int end = a.length-1;

        MaxSumSubArray m = new MaxSumSubArray();
        int maxSumSubArray = m.FindMaxSumSubArray(a, start, end);
        System.out.println(maxSumSubArray);
    }
}