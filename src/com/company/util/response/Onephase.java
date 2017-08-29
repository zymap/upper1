package com.company.util.response;

import com.company.util.compute.HexCompute;

/**
 * create by zy on 17-8-26 upper.
 */
public class Onephase {
    private final static int REQUEST_LENGTH = 36;        //请求长度
    private final static int END_LENGTH = 4;             //尾部四位数据不解析
    private final static int ONE_PHASE_RESPONSE_SIZE = 24;  //电量
    private static String[] ONE_PHASE_TABLE;               //单相表
    private final static int POWER = 4;                  //%
    private final static int ELECTRIC = 5;               //电流
    private final static int VOLTAGE = 7;                //电压
    private final static int USE_ELECTRIC = 12;           //用电量
    private final static int UNIT = 14;                  //单元
    private final static int HOUSEHOLD = 15;             //户

    public static String split(String datasource){
        int end = datasource.length()-END_LENGTH;
        String result = datasource.substring(REQUEST_LENGTH,end);
        ONE_PHASE_TABLE = HexCompute.minu(result, ONE_PHASE_RESPONSE_SIZE);
        return result;
    }

    public static String getElectric(){
        String result = "";
        for (int i = 4; i > 0; i--){
            if (i == 3){
                result += ONE_PHASE_TABLE[ONE_PHASE_RESPONSE_SIZE -i]+".";
            }else {
                result += ONE_PHASE_TABLE[ONE_PHASE_RESPONSE_SIZE -i];
            }
        }
        return result;
    }

    public static String getUnit(){
        return ONE_PHASE_TABLE[UNIT];
    }

    public static String getUseElectric(){
        return ONE_PHASE_TABLE[USE_ELECTRIC]+ ONE_PHASE_TABLE[USE_ELECTRIC +1];
    }


    public static String getElectricity(){
        return ONE_PHASE_TABLE[ELECTRIC] + "." + ONE_PHASE_TABLE[ELECTRIC+1];
    }

    public static String getVoltage(){
        char[] chars = ONE_PHASE_TABLE[VOLTAGE+1].toCharArray();
        return ONE_PHASE_TABLE[VOLTAGE] + chars[0] + "." +chars[1];
    }

    public static String getHouseHold(){
        return ONE_PHASE_TABLE[HOUSEHOLD]+ ONE_PHASE_TABLE[HOUSEHOLD+1];
    }

    public static String getPower(){
        return ONE_PHASE_TABLE[POWER];
    }
}
