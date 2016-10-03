package com.yh.yhou5_habittracker;

import java.util.Date;

/**
 * Created by yhou5 on 10/3/16.
 */
public class Habit {

    //set private value to record habit name, entry date, day of the week that it should appear, and completion times
    private String name;
    private String day;
    private Date date;
    private int times;

    //Constructor
    public Habit(String name){
        this.date = new Date();
        this.name = name;
        this.times = 0;
    }

    //A method to show whether the habit is completed
    public boolean completion(){return times>0;}

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

}
