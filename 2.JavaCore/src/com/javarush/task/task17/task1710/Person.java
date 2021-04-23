package com.javarush.task.task17.task1710;

import java.util.Date;

public class Person extends Solution{
    private String name;
    private Sex sex;
    private Date birthDate;

    public Person(String name, Sex sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public static Person createMale(String name, Date birthDate) {
        return new Person(name, Sex.м, birthDate);
    }

    public static Person createFemale(String name, Date birthDate) {
        return new Person(name, Sex.ж, birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
