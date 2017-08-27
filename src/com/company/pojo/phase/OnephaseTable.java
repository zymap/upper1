package com.company.pojo.phase;


import java.math.BigDecimal;

/**
 * Created by zy on 17-8-26.
 */
public class OnephaseTable {
    private BigDecimal electric;      //电量
    private int household;            //户
    private int unit;                 //单元
    private int useElectric;          //用电量(W)
    private BigDecimal voltage;       //电压
    private BigDecimal electricty;    //电流
    private BigDecimal power;         //(%)

    public BigDecimal getElectric() {
        return electric;
    }

    public void setElectric(BigDecimal electric) {
        this.electric = electric;
    }

    public int getHousehold() {
        return household;
    }

    public void setHousehold(int household) {
        this.household = household;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
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
        return power;
    }

    public void setRate(BigDecimal power) {
        this.power = power;
    }
}
