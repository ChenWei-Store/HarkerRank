package dataStructures.arrays.utils;

/**
 * Created by chenw on 2017/6/18.
 */
public class ArrayReverseUtils {
    /**
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     * @param nums
     * @return
     */
    public int[] reverse(int []nums){
        int []revserNum = new int[nums.length];

        for(int i = nums.length - 1, j = 0; i >= 0; i--, j++){
            revserNum[j] = nums[i];
        }

        return revserNum;

    }

    /**
     * 时间复杂度 O(n/2) = O(n)
     * @param nums
     * @return
     */
    public int[] reverse2(int []nums){
        for(int i = 0, j = nums.length - 1; i < nums.length / 2; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

    public void print(int []nums){
        for(int i = 0; i < nums.length; i++){
            if(i < nums.length - 1) {
                System.out.print(nums[i] + " ");
            }else{
                System.out.print(nums[i]);
            }
        }
    }

}
