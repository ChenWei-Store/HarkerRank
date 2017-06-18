package dataStructures.arrays.utils;

/**
 * Created by chenw on 2017/6/18.
 */
public class RotationUtils {

    /**
     * 时间复杂度O(n)
     * 空间复杂度(n)
     * @param num
     * @param rotationCount
     * @return
     */
    public int[] leftRotation(int[] num, int rotationCount){
        int []rotationsNum = new int[num.length];
        int j = 0;
        for(int i = rotationCount; i < rotationsNum.length; i++, j++){
            rotationsNum[j] = num[i];
        }

        for(int i = 0; i < rotationCount; j++, i++){
            rotationsNum[j] = num[i];
        }
        return rotationsNum;
    }

    /**
     * 右移n为相当于左移nums.len - n位
     * @param num
     * @param rotationCount
     * @return
     */
    public int[] rightRotation(int []num, int rotationCount){
        return leftRotation(num, num.length - rotationCount);
    }

    public void printfNums(int []nums){
        for(int i = 0; i < nums.length; i++){
            if(i < nums.length -1){
                System.out.print(nums[i] + " ");
            }else{
                System.out.print(nums[i]);
            }
        }
    }
}
