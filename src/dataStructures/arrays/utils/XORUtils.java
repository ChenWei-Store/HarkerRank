package dataStructures.arrays.utils;


import dataStructures.arrays.model.XORData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by chenw on 2017/6/18.
 */
public class XORUtils {
    private static final int TYPE_ONE = 1;
    private static final int TYPE_TWO = 2;
    private Map<Integer, Stack<Integer>> xORResult;
    private int lastAnswer;
    private int N;

    public XORUtils(int n) {
        N = n;
        xORResult = new HashMap<>();
    }

    public XORUtils() {
        xORResult = new HashMap<>();
    }

    public void xOr(ArrayList<XORData> xorData){
        for(int i = 0; i < xorData.size(); i++){
            XORData data = xorData.get(i);
            if(data.getType() == TYPE_ONE){
                xORType1(data);
            }else if (data.getType() == TYPE_TWO){
                xORType2(data);
            }
        }
    }

    private void xORType1(XORData xorData){
        int result = xorCompute(xorData);
        Stack<Integer> s = xORResult.get(result);
        if(s == null){
            s = new Stack<>();
        }
        s.push(xorData.getY());
        xORResult.put(result, s);
    }

    private void xORType2(XORData xorData){
        int result =xorCompute(xorData);
        Stack<Integer> s = xORResult.get(result);
        lastAnswer = s.pop();
        System.out.println(lastAnswer);
    }

    private int xorCompute(XORData data){
        return (data.getX() + lastAnswer) % N;
    }
}
