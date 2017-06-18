package dataStructures.arrays.utils;

/**
 * Created by chenw on 2017/6/18.
 */
public class TwoDArrayDSUtils {
    /**
     * 时间复杂度：n(n * m)
     * @param nums
     * @return
     */
    public int maxSum(int [][] nums){
        int maxSum = 0;
        for(int i = 0; i < nums.length - 2; i ++){
            for(int j = 0; j < nums.length - 2; j++){
                int temp = (nums[i][j] + nums[i][j+1] + nums[i][j+2]
                        + nums[i+1][j+1]
                        + nums[i + 2][j] + nums[i + 2][j+1] + nums[i + 2][j+2]);
                if(i == 0 && j == 0){
                    maxSum = temp;
                }else{
                    if(temp > maxSum){
                        maxSum = temp;
                    }
                }
            }
        }

        return maxSum;
    }
}
