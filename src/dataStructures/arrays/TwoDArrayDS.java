package dataStructures.arrays;


import dataStructures.arrays.utils.TwoDArrayDSUtils;

import java.util.Scanner;

/**
 * Created by chenw on 2017/6/10.
 */
public class TwoDArrayDS {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int nums[][] = new int[6][6];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                nums[i][j] = in.nextInt();
            }
        }

        TwoDArrayDSUtils utils = new TwoDArrayDSUtils();
        int maxSum = utils.maxSum(nums);
        System.out.println(maxSum);
    }


}



