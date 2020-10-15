package com.nuig.assignment1;

import java.util.ArrayList;

/**
 *
 * @author mohdm
 */
public class Module {
    private String module_name;
    private String id; 
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    
    public Module(String module_name, String id, ArrayList<Student> students, ArrayList<Course> courses){
        this.module_name = module_name;
        this.id = id;
        this.students = students; 
        this.courses = courses;
    }
    
    public Module(){}
    
    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
    
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    //Added utility methods
    public void addStudent(Student s){this.students.add(s);}
    public void removeStudent(Student s){
        int idx = -1;
        for (int i=0;i<this.students.size();i++){
            if ( this.students.get(i).getId() == s.getId() ) {idx=i;}
        }
        if(idx!=-1){this.students.remove(idx);}
    }
    public void printStudents(){
        String buff = "Students in module "+ this.module_name+":\n";
        for(Student s:this.students){
            buff+=s.getName()+"\n";
        }
        System.out.println(buff);
    }
    
    public void addCourse(Course c){this.courses.add(c);}
    public void removeCourse(Course c){
        int idx = -1;
        for (int i=0;i<this.courses.size();i++){
            if ( this.courses.get(i).getCourse_name().equals(c.getCourse_name()) ) {idx=i;}
        }
        if(idx!=-1){this.courses.remove(idx);}
    }
    public void printCourses(){
        String buff = "Courses with module "+ this.module_name+":\n";
        for(Course c:this.courses){
            buff+=c.getCourse_name()+"\n";
        }
        System.out.println(buff);
    }
}