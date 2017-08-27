package com.company.pojo.phase;

import java.math.BigDecimal;

/**
 * Created by zy on 17-8-26.
 */
public class ThreephaseTable {
    private int phase;                //相
    private int useElectric;          //电量
    private BigDecimal voltage;       //电压
    private BigDecimal electricty;    //电流
    private BigDecimal rate;          //比率
    private int power;                //(%)

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public int getUseElectric() {
        return useElectric;
    }

    public void setUseElectric(int useElectric) {
        this.useElectric = useElectric;
    }

    public BigDecimal getVoltage() {
        return voltage;
    }

    public void setVoltage(BigDecimal voltage) {
        this.voltage = voltage;
    }

    public BigDecimal getElectricty() {
        return electricty;
    }

    public void setElectricty(BigDecimal electricty) {
        this.electricty = electricty;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
