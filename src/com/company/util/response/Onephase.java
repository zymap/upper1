package com.company.util.response;

/**
 * Created by zy on 17-8-26.
 */
public class Onephase {
    private final int REQUEST_LENGTH = 36;
    private final int END_LENGTH = 4;

    public String split(String datasource){
        int begin = REQUEST_LENGTH;
        int end = datasource.length()-END_LENGTH;
        String result = datasource.substring(begin,end);
        return result;
    }
}
