package com.company;
//Create a class school
public class School {
    // Create a class attribute
    public int numberOfCourses;
    public String nameOfSchool;
    public String isSchoolOld;
    public String isTeachingNewTech;
    public String nameOfStudent;

    // Create a class constructor for the School class
    public School(int numOfCourses, String whatsTheSchool, String oldSchool, String teachingIT, String studentNames ) {
        // Set the initial value for the class attributes
        this.numberOfCourses = numOfCourses;
        this.nameOfSchool = whatsTheSchool;
        this.isSchoolOld = oldSchool;
        this.isTeachingNewTech = teachingIT;
        this.nameOfStudent = studentNames;
    }
}
