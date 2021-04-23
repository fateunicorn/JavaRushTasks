package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

/* 
CRUD
*/

public class Solution {
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    public static List<Person> allPeople = new ArrayList<Person>(){

    };

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
        /*new Souter(1);
        allPeople.set(1, Person.createMale("Петроп Петп", new Date()));  //сегодня родился    id=1
        new Souter(1);
        allPeople.set(1, null);
//        allPeople.souter(0)
        new Souter(1);
        new Souter(0);*/
    }

    public static void main(String[] args) {

        new Parametrizer(CUDI.c, "Иванон Ивав", Sex.м, new Date());
        new Parametrizer(CUDI.c, "Петрор Петт", Sex.м, new Date());
        new Parametrizer(CUDI.c, 2, "Иварор Иветт", Sex.м, new Date());
        new Parametrizer(CUDI.d, 3);
        new Parametrizer(CUDI.i, 3);
        /*
        public void souter(int i) {
            System.out.println(allPeople.get(i).getName()+" "+allPeople.get(i).getSex()+" "+(simpleDateFormat.format(allPeople.get(i).getBirthDate())));;
        }

        System.out.println(allPeople.get(index).getName()+" "+allPeople.get(index).getSex()+" "+(simpleDateFormat.format(allPeople.get(index).getBirthDate())));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        System.out.println(allPeople.get(i).getName()+" "+allPeople.get(i).getSex()+" "+(simpleDateFormat.format(allPeople.get(i).getBirthDate())));*/
    }
}

/*

        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH);
        System.out.println(simpleDateFormat.format(date).toUpperCase());


    public static Person souter(int i){
        System.out.println(allPeople.get(i).getName()+" "+allPeople.get(i).getSex()+" "+(simpleDateFormat.format(allPeople.get(i).getBirthDate())));
    }
*/