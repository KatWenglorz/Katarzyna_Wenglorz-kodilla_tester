package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    String job;

    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Person julia = new Person("Julia", 32, "ShopAssistant");
        ShopAssistant shopAssistant = new ShopAssistant();
        System.out.println(julia.firstName + "'s responsibilities are: " + shopAssistant.getResponsibilities());

        Person michal = new Person("Michał", 45, "Teacher");
        Teacher teacher = new Teacher();
        System.out.println(michal.firstName + "'s responsibilities are: " + teacher.getResponsibilities());

        Person martin = new Person("Marcin", 60, "Programmer");
        Programmer programmer = new Programmer();
        System.out.println(martin.firstName + "'s responsibilities are: " + programmer.getResponsibilities());
    }
}
