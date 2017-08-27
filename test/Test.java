import sun.plugin2.applet.context.InitialJNLPExecutionContext;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Created by zy on 17-8-25.
 */
public class Test {
    public static void main(String[] args) {
//        String ss = "680136321100006803083235b43a343333337716";
//        String sss = "680136321100006803083235b43a343333333334b935333333383334483633333373557334c733383433bf16";
//
//        System.out.println(ss.length());
//        System.out.println(sss.substring(ss.length()-4,sss.length()-4));
//
//        String ssss = sss.substring(ss.length()-4,sss.length()-4);
//        System.out.println(ssss);
//        char[] chars = ssss.toCharArray();
////        System.out.println(chars.length);
//        int aa = Integer.parseInt("33",16);
//        String aaaa = "";
//
//        for (int i = 0; i < chars.length-1; i+=2){
//            int a = Integer.parseInt(""+chars[i]+chars[i+1],16);
//            int result = a-aa;
//
//            System.out.println(result);
//            aaaa += Integer.toHexString(result);
//        }
//
//        System.out.println(aaaa);


        String s = "3334b935";
        byte b = ByteBuffer.wrap(s.getBytes()).order(ByteOrder.LITTLE_ENDIAN).get();
        System.out.println(b);
//        String a = "73";
//        String b = "33";
//
//        int aa = Integer.parseInt(a,16);
//        int bb = Integer.parseInt(b,16);
//
//        int cc = aa-bb;
//
//        System.out.println(Integer.toHexString(cc));

    }
}
//33383334483633333373557334c733383433
//3334483633333373557334c733383433