package com.nuig.assignment1;

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
    
    //Added utility methods
    public void addModule(Module m){this.modules.add(m);}
    public void removeModule(Module m){
        int idx = -1;
        for (int i=0;i<this.modules.size();i++){
            if (this.modules.get(i).getId().equals(m.getId())){idx=i;}
        }
        if(idx!=-1){this.modules.remove(idx);}
    }
    public void printModules(){
        String buff = "Modules for student "+ this.name+":\n";
        for(Module m:this.modules){
            buff+=m.getModule_name()+"\n";
        }
        System.out.println(buff);
    }
}