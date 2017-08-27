package util;

import com.company.pojo.Elec;

/**
 * Created by zy on 17-8-26.
 */
public class ElecTest {
    public static void main(String[] args) {
        Elec elec = new Elec();
        String s = elec.toSmall("01020304");
//        String s = "0102030405060007";
//        System.out.println(elec.combine(s));
//        String[] var = s.split("");
//        for (String o : var){
//            System.out.println(o);
//        }
        System.out.println(s);
    }
}
