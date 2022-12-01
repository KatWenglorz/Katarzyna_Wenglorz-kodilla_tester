package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> studentsNumber = new ArrayList<>();

    public School(List<Integer> studentsNumber) {
        this.studentsNumber = studentsNumber;
    }
    public int getSchoolNumberOfStudents() {
        int sum = 0;
        for (int number : studentsNumber) {
            sum += number;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "studentsNumber=" + studentsNumber +
                '}';
    }
}
