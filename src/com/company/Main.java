package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Create an object of class School (This will call the constructor)
        School school = new School(4, "ToCoolSchool", "false", "true", "");
        // Print the values
        System.out.println(String.format("Name of School: %s",school.nameOfSchool));
        System.out.println(String.format("Number of Courses: %s",school.numberOfCourses));
        System.out.println(String.format("Is it a old School?: %s",school.isSchoolOld));
        System.out.println(String.format("Do they Teach IT?: %s",school.isTeachingNewTech));
        System.out.println(String.format("Name of Student attending there is: %s Aisha",school.nameOfStudent));




    }
}
