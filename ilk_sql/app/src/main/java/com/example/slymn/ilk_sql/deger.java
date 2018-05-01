package com.example.slymn.ilk_sql;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Slymn on 19.04.2018.
 */

public class deger {
    int  motor;
    int panel;
    int id;
    String tarih;
    int bgelen;
    public int getBgelen() {
        return bgelen;
    }

    public void setBgelen(int bgelen) {
        this.bgelen = bgelen;
    }



    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;

    }


    public deger(int bgelen) {
        this.bgelen = bgelen;
    }

    public deger(int motor, int panel) {
        this.motor = motor;
        this.panel = panel;


    }
    public deger(int motor, int panel,String tarih) {
        this.motor = motor;
        this.panel = panel;
        this.tarih=tarih;

    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPanel() {
        return panel;
    }

    public void setPanel(int panel) {
        this.panel = panel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "    "+motor+"               "+panel+"                "+tarih;
    }
}
