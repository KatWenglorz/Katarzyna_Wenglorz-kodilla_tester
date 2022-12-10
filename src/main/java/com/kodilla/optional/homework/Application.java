package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam Mickiewicz", new Teacher("Danuta Kawecka")));
        students.add(new Student("Jan Kowalski", new Teacher("Tomasz Nowak")));
        students.add(new Student("Robert Lewandowski", null));
        students.add(new Student("Anna Lewandowska", new Teacher("Adam Małysz")));
        students.add(new Student("Ewelina Wróbel", new Teacher("Danuta Kawecka")));
        students.add(new Student("Michał Nowak", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String name = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Uczeń: " + student.getName() + " , nauczyciel: " + name );
        }
    }
}
