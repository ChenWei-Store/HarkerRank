package dataStructures.arrays;


import dataStructures.arrays.model.XORData;
import dataStructures.arrays.utils.XORUtils;

import java.util.*;

/**
 * Created by chenw on 2017/6/10.
 */
public class DynamicArray {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        ArrayList<XORData> xorDatas = new ArrayList<>();
        for(int i = 0; i < Q; i++){
          XORData xorData = new XORData();
          xorData.setType(scanner.nextInt());
          xorData.setX(scanner.nextInt());
          xorData.setY(scanner.nextInt());
          xorDatas.add(xorData);
        }

        XORUtils xorUtils = new XORUtils(N);
        xorUtils.xOr(xorDatas);
    }



}



