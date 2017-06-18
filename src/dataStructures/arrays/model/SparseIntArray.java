package dataStructures.arrays.model;


import java.util.Arrays;

/**
 * Created by chenw on 2017/6/18.
 */
public class SparseIntArray {
    private String[] keys;
    private int[] values;
    private int lastPosi;
    private int length;
    private int growLength = 5;
    public SparseIntArray(){
        length = 10;
        keys = new String[length];
        values = new int[length];
    }

    public void put(String key, int value){
        int posi = contains(key);
        if(posi != -1){
            values[posi] = value;
            return;
        }

        if(length - 1 == lastPosi){
            grow();
        }
        keys[lastPosi] = key;
        values[lastPosi] = value;
        lastPosi++;
    }



    private void grow(){
        keys = Arrays.copyOf(keys, length + growLength);
        values = Arrays.copyOf(values, length + growLength);
        length += growLength;
    }

    /**
     *
     * @param key
     * @return null 表示不存在key
     */
    public Integer get(String key){
        int posi = contains(key);
        if(posi == -1){
            return null;
        }
        return values[posi];
    }


    /**
     *
     * @param searchedKey
     * @return -1表示不存在该key
     */
    public int contains(String searchedKey){

        for(int i = 0; i < keys.length; i++){
            String key = keys[i];
            if(key == null){
                return -1;
            }
            if(key.equals(searchedKey)){
                return i;
            }
        }
        return -1;
    }

}
