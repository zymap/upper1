package util;

/**
 * created by zy on 17-8-27 .
 */
public class Onephase {
    public static void main(String[] args) {
        com.company.util.response.Onephase onephase = new com.company.util.response.Onephase();
        String xxx = "680136321100006803083235b43a343333333334b935333333383334483633333373557334c733383433bf16";
        String sss = onephase.split(xxx);
//        String ssss = onephase.getElectric(sss);

        String a= onephase.getElectric();
        System.out.println(a);
        System.out.println(onephase.getHouseHold());
        System.out.println(onephase.getUnit());
        System.out.println(onephase.getUseElectric());
        System.out.println(onephase.getVoltage());
        System.out.println(onephase.getElectricity());
        System.out.println(onephase.getPower());
//        System.out.println(ssss);

//        System.out.println(sss);
    }
}
//3334b935333333383334483633333373557334c733383433
//3334b935333333383334483633333373557334c733383433
//333333383334483633333373557334c733383433