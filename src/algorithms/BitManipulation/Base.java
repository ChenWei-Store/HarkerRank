package algorithms.BitManipulation;

/**
 * Created by chenw on 2017/6/14.
 */
public class Base {
    public static void main(String []args){
        int num = 11;
        System.out.println(num);
        System.out.println(Integer.toBinaryString(num));
        System.out.println("<< 3");
        num = num << 3;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(num);

        num = num >> 3;
        System.out.println(">> 3");
        System.out.println(Integer.toBinaryString(num));
        System.out.println(num);

        num = num >>> 2;
        System.out.println(">>> 2");
        System.out.println(Integer.toBinaryString(num));
        System.out.println(num);

    }

}
