
// Time complexity of whole program is 3n + c
public class WaterTrap {
    public int trapWater(int[] height){

        int water = 0;

        int size = height.length;
        int leftMax[] = new int[size];
        int rightMax[] = new int[size];

        leftMax[0] = height[0];  // left max
        // for inserting left max of the height in the leftMax
        for(int i = 1; i<size; i++){  // time complexity = n
            leftMax[i] = Math.max(leftMax[i-1], height[i]);

        }

        rightMax[size-1] = height[size-1];  // this covers size -1
        // for inserting right max of the height in the rightMax
        // time complexity = n
        for(int i = size-2; i >= 0; i--){  // since, size-1 is already covered/added in rightMax, so begining from size-1-1


            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        // time complexity = n
        for(int i=0; i<size; i++){
            water = water + (Math.min(leftMax[i], rightMax[i]) - height[i]);
        }
        return water;
    }


    public static void main(String[] args){
        
        WaterTrap waterTrap = new WaterTrap();
        int height[] = {3,2,0,2,4};
        System.out.println(waterTrap.trapWater(height));
    }
}
