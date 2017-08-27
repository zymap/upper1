package util;

import com.company.pojo.Elec;
import com.company.util.request.RequestElec;

/**
 * Created by zy on 17-8-26.
 *
 * .
 *
 */
public class RequestElecTest {
    public static void main(String[] args) {
        Elec e = new Elec();
        e.setId("01");
        e.setElec_name("000000113236");
        e.setControl("03");
        e.setCommand("3235b43a34333333");
        RequestElec elec = new RequestElec();
        String result = elec.createCommand(e);
        System.out.println(result);



        //680136321100006803083235b43a343333337716  发送的十六进制数
    }
}
