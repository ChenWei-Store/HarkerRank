package dataStructures.arrays;


import dataStructures.arrays.utils.RotationUtils;

import java.util.Scanner;

/**
 * Created by chenw on 2017/6/18.
 */
public class LeftRotation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int rotations = scanner.nextInt();
        int []nums = new int[count];
        for(int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }

        RotationUtils leftRotationUtils = new RotationUtils();
        int []rotationsNums = leftRotationUtils.leftRotation(nums, rotations);
        leftRotationUtils.printfNums(rotationsNums);
    }

}
