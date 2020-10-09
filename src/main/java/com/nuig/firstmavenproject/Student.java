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
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
    
}