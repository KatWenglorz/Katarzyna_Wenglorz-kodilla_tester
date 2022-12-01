package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String firstName;
    private String lastName;
    private String schoolName;

    public Principal(String firstName, String lastName, String schoolName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolName = schoolName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(firstName, principal.firstName) && Objects.equals(lastName, principal.lastName) && Objects.equals(schoolName, principal.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, schoolName);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}