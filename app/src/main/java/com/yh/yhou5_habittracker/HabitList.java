package com.yh.yhou5_habittracker;

/**
 * Created by yhou5 on 10/3/16.
 */
import java.util.ArrayList;

/**
 * Created by hy199 on 2016/10/2.
 */
public class HabitList {

    //Prepare a list for recording
    private ArrayList<Habit> habits = new ArrayList<Habit>();

    //constructor
    public HabitList(){}

    //Method fot adding new habit. If the habit already exists, update "day" only
    public void add(String name, String day){
        Habit habit = new Habit(name);
        int index;
        for(index=0;index<habits.size();index++){
            if(habits.get(index).getName()==name){break;}
        }
        if(index == habits.size()) {
            habits.add(habit);
            habits.get(index).setDay(day);
        }else{habits.get(index).setDay(day);}
    }

    //Method for deleting a existing habit
    public void delete(String name){
        int index;
        for(index=0;index<habits.size();index++){
            if(habits.get(index).getName()==name){break;}
        }
        habits.remove(index);

    }

    //Method for cleaning all record of completion
    public void clearAllCompletion(){
        for(int index=0;index<habits.size();index++){
            habits.get(index).setTimes(0);
        }
    }

    //Method fot cleaning completion of one habit
    public void clearCompletion(String name){
        int index;
        for(index=0;index<habits.size();index++){
            if(habits.get(index).getName()==name){break;}
        }
        if(index == habits.size()){
            throw new IllegalAccessError();
        }else{habits.get(index).setTimes(0);}
    }

    //Method for resetting the list
    public void clearAll(){habits = new ArrayList<Habit>();}

    //Method for getting times of completion of one habit
    public int showCompletedTimes(String name){
        int index;
        for(index=0;index<habits.size();index++){
            if(habits.get(index).getName()==name){break;}
        }
        if(index == habits.size()){
            throw new IllegalAccessError();
        }else{return habits.get(index).getTimes();}
    }

    //Method for showing whether a habit is completed
    public boolean showCompletion(String name){
        int index;
        for(index=0;index<habits.size();index++){
            if(habits.get(index).getName()==name){break;}
        }
        if(index == habits.size()){
            throw new IllegalAccessError();
        }else{return habits.get(index).completion();}
    }

    //Method for recording a completion to a habit
    public void complete(String name){
        int index;
        for(index=0;index<habits.size();index++){
            if(habits.get(index).getName()==name){break;}
        }
        if(index == habits.size()){
            throw new IllegalAccessError();
        }else{
            habits.get(index).setTimes(habits.get(index).getTimes()+1);
        }
    }

    //Method for getting a list of uncompleted habits
    public ArrayList<String> showUncompleted(){
        ArrayList<String> uncompleted = new ArrayList<String>();
        for(int index=0;index<habits.size();index++){
            if(habits.get(index).completion()){}else{
                uncompleted.add(habits.get(index).getName());
            }
        }
        return uncompleted;
    }

    //getter of the list
    public ArrayList<Habit> getHabits() {
        return habits;
    }
}