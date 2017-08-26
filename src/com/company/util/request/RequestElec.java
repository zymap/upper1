package com.company.util.request;

import com.company.pojo.Elec;
import org.omg.PortableInterceptor.INACTIVE;

/**
 * Created by zy on 17-8-25.
 */
public class RequestElec {
    private final static int FIXED = 68;
    private final static int END_FIXED = 16;

    public String createCommand(Elec elec){
        String middle = FIXED+elec.getId()+elec.getToSmallElecName()+FIXED+elec.getControl()+"08"+elec.getCommand();
        String result = middle + getVerify(middle) + END_FIXED;
        return result;
    }

    public String getVerify(String var){
        int verify = 0;
        char[] chars = var.toCharArray();
        int[] result = new int[chars.length/2];
        for (int i = 0; i < chars.length; i=i+2){
            int t =  Integer.parseInt(""+chars[i]+chars[i+1],16);
            result[i/2] = t;
        }
        for (int i = 0; i < result.length; i++){
            verify += result[i];
        }
        String temp = Integer.toHexString(verify);
        String hex = "" + temp.charAt(temp.length()-2)+temp.charAt(temp.length()-1);
        return hex;
    }

    private byte[] ToHexByte(String hexString){
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d;
    }

    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    public static String ToHexString(byte[] src){
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }
}
