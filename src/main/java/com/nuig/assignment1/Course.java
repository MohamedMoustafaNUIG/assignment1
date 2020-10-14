package com.nuig.assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author mohdm
 */
public class Course {
    private String course_name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime start_date;
    private DateTime end_date; 
    
    public Course(String course_name, ArrayList<Module> modules, ArrayList<Student> students, DateTime start_date, DateTime end_date){
        this.course_name = course_name;
        this.modules = modules;
        this.students = students;
        this.start_date = start_date;
        this.end_date = end_date;
    }
    public Course(){}
    
    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getStart_date() {
        return start_date;
    }

    public void setStart_date(DateTime start_date) {
        this.start_date = start_date;
    }

    public DateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(DateTime end_date) {
        this.end_date = end_date;
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
        String buff = "Modules for course "+ this.course_name+":\n";
        for(Module m:this.modules){
            buff+=m.getModule_name()+"\n";
        }
        System.out.println(buff);
    }
    
    public void addStudent(Student s){this.students.add(s);}
    public void removeStudent(Student s){
        int idx = -1;
        for (int i=0;i<this.students.size();i++){
            if ( this.students.get(i).getId() == s.getId() ) {idx=i;}
        }
        if(idx!=-1){this.students.remove(idx);}
    }
    public void printStudents(){
        String buff = "Students in course "+ this.course_name+":\n";
        for(Student s:this.students){
            buff+=s.getName()+"\n";
        }
        System.out.println(buff);
    }
    
}