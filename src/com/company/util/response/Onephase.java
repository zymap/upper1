package com.company.util.response;

/**
 * Created by zy on 17-8-26.
 */
public class Onephase {
    private final int REQUEST_LENGTH = 36;
    private final int END_LENGTH = 4;
    private final static String SUBTRACTOR = "33";
    private final static int ONEPHASERESPONSESIZE = 24;
    private String[] onephasetable;
    private final int POWER = 4;
    private final int ELECTRIC = 5;
    private final int VOLTAGE = 7;
    private final int USEELECTRIC = 12;
    private final int UNIT = 14;
    private final int HOUSEHOLD = 15;

    public String split(String datasource){
        int begin = REQUEST_LENGTH;
        int end = datasource.length()-END_LENGTH;
        String result = datasource.substring(begin,end);
        compute(result);
        return result;
    }

    public String getElectric(){
        String result = "";
        for (int i = 4; i > 0; i--){
            if (i == 3){
                result += onephasetable[ONEPHASERESPONSESIZE-i]+".";
            }else {
                result += onephasetable[ONEPHASERESPONSESIZE-i];
            }
        }
        return result;
    }

    public String getVoltage(){
        char[] chars = onephasetable[VOLTAGE+1].toCharArray();
        return onephasetable[VOLTAGE] + chars[0] + "." +chars[1];
    }

    public String getHouseHold(){
        return onephasetable[HOUSEHOLD]+onephasetable[HOUSEHOLD+1];
    }

    public String getPower(){
        return onephasetable[POWER];
    }

    private void compute(String var){
        String[] result = new String[ONEPHASERESPONSESIZE];
        char[] chars = var.toCharArray();
        int length = chars.length;
        for (int i = length-1; i >= 0; i = i-2){
            int pos = (length-i)/2;
            String temp = "" + chars[i-1] + chars[i];
            result[pos] = minu(temp);
        }
        this.onephasetable = result;
    }

    private String minu(String var){
        int a = Integer.parseInt(var,16);
        int b = a-Integer.parseInt(SUBTRACTOR,16);
        return Integer.toHexString(b);
    }
}
