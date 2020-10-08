package com.nuig.firstmavenproject;

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
}
