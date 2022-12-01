package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> students = new HashMap<>();

        Principal martin = new Principal("Martin", "Smith", "School of Happy Valley");
        Principal john = new Principal("John", "Johnson", "Sacred Heart Academy");
        Principal david = new Principal("David", "Davis", "Preparatory School");
        Principal william = new Principal("William", "Williams", "Montessori School");

        School martinSchool = new School(Arrays.asList(23, 25, 30, 15, 26, 10, 29));
        School johnSchool = new School(Arrays.asList(24, 20, 26, 17, 22, 26, 25, 24));
        School davidSchool = new School(Arrays.asList(12, 10, 20));
        School williamSchool = new School(Arrays.asList(25, 25, 30, 29, 23, 24));

        students.put(martin, martinSchool);
        students.put(john, johnSchool);
        students.put(david, davidSchool);
        students.put(william, williamSchool);

       for (Map.Entry<Principal, School> principalEntry : students.entrySet()) {
           System.out.println(principalEntry.getKey().getSchoolName() + " , " + principalEntry.getKey().getFirstName() + " " + principalEntry.getKey().getLastName() + " , total number of students: " + principalEntry.getValue().getSchoolNumberOfStudents());
       }
    }
}
