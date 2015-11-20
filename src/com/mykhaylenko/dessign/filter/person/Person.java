package com.mykhaylenko.dessign.filter.person;

/**
 * Created by Pavlo.Mykhaylenko on 9/28/2015.
 */
public class Person {

    private String name;
    private String gender;
    private boolean isMarried;

    public Person(String name, String gender, boolean isMarried) {
        this.name = name;
        this.gender = gender;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
}
