package com.company.pojo;

/**
 * Created by zy on 17-8-25.
 */
public class Elec {
    private String id;                //序号
    private String elec_name;       //表号
    private String control;           //控制
    private String command;        //指令

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getElec_name() {
        return elec_name;
    }

    public void setElec_name(String elec_name) {
        this.elec_name = elec_name;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getToSmallElecName(){
        return toSmall(elec_name);
    }

    public String toSmall(String var){
        StringBuilder builder = new StringBuilder();
        char[] chars = var.toCharArray();
        for (int i = chars.length-1; i >2; i=i-2){
            builder.append(chars[i-1]);
            builder.append(chars[i]);
        }
        return builder.toString();
    }
}
