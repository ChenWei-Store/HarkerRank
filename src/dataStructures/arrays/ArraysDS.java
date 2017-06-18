package dataStructures.arrays;


import dataStructures.arrays.utils.ArrayReverseUtils;

import java.util.Scanner;

/**
 * Created by chenw on 2017/6/10.
 * 数组倒置
 */
public class ArraysDS {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int arraysCount = in.nextInt();
        int []nums = new int[arraysCount];
        for(int i = 0; i < arraysCount; i++){
            nums[i] = in.nextInt();
        }

        ArrayReverseUtils reverseUtils = new ArrayReverseUtils();
        int reversedNums[] = reverseUtils.reverse2(nums);

        reverseUtils.print(reversedNums);
    }


}


