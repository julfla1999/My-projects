package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String lastName;
    private String schoolName;

    public Principal(String lastName, String schoolName) {
        this.lastName = lastName;
        this.schoolName = schoolName;
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
        return Objects.equals(lastName, principal.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "lastName='" + lastName + '\'' +
                '}';
    }
}
