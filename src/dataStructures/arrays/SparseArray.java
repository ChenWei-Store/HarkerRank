package dataStructures.arrays;


import dataStructures.arrays.model.SparseIntArray;

import java.util.Scanner;

/**
 * Created by chenw on 2017/6/18.
 */
public class SparseArray {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        SparseIntArray strCountArray = new SparseIntArray();

        String str = null;
        int count = 0;
        for(int i = 0; i < sum; i++){

            str = scanner.next();
            Integer countInteger = strCountArray.get(str);
            if(countInteger == null){
                count = 1;
            }else{
                count = countInteger.intValue() + 1;
            }
            strCountArray.put(str, count);
        }

        sum = scanner.nextInt();
        for(int i = 0; i < sum; i++){
            str = scanner.next();
            Integer countInteger = strCountArray.get(str);
            if(countInteger == null){
                count = 0;
            }else{
                count = countInteger.intValue();
            }
            System.out.println(count);

        }

    }
}
