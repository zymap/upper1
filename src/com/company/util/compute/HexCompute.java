package com.company.util.compute;

/**
 * created by zy on 17-8-29 .
 */
public class HexCompute {
    private final static String SUBTRACTOR = "33";       //每位数据的减数

    public static String[] minu(String var, int size){
        String[] result = new String[size];
        char[] chars = var.toCharArray();
        int length = chars.length;
        for (int i = length-1; i >= 0; i = i-2){
            int pos = (length-i)/2;
            String temp = "" + chars[i-1] + chars[i];
            result[pos] = minu(temp);
        }
        return result;
    }

    private static String minu(String var){
        int a = Integer.parseInt(var,16);
        int b = a-Integer.parseInt(SUBTRACTOR,16);
        return Integer.toHexString(b);
    }
}
