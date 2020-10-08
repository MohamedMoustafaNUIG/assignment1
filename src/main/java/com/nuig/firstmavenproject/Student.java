package com.nuig.firstmavenproject;

import java.util.ArrayList;
import org.joda.time.DateTime;
/**
 *
 * @author mohdm
 */
public class Student {
    private String name;
    private int age;
    private DateTime dob;
    private int id;
    private String username;
    private Course course;
    private ArrayList<Module> modules;

    public Student(String name, int age, DateTime dob, int id, Course course, ArrayList<Module> modules){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = getUsername();
        this.course = course;
        this.modules = modules;
    }
    
    public Student(){
        
    }
    public String getUsername(){
        if (this.name == null){
            return "N/A";
        }else{
            return this.name + Integer.toString(this.age);
        }
    }
}