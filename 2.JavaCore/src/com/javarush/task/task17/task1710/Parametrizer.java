package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Parametrizer{
    /*public class Prmtr {
    }*/
    /*
-c name sex bd
-u id name sex bd
-d id
-i id
    */

    Parametrizer(CUDI cudi, int index, String name, Sex sex, Date birthDate){
        if (cudi.equals(CUDI.c)){
            if (sex.equals(Sex.м)){
                Solution.allPeople.set(index, Person.createMale(name,birthDate));
            }
            if (sex.equals(Sex.ж)){
                Solution.allPeople.set(index, Person.createFemale(name,birthDate));
            }
        }
    }

    Parametrizer(CUDI cudi, String name, Sex sex, Date birthDate) {
        if (cudi.equals(CUDI.u)) {
            if (sex.equals(Sex.м)) {
                Solution.allPeople.add(Person.createMale(name, birthDate));
            }
            if (sex.equals(Sex.ж)) {
                Solution.allPeople.add(Person.createFemale(name, birthDate));
            }
        }
    }

    Parametrizer(CUDI cudi, int index){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        if (cudi.equals(CUDI.d)){
            Solution.allPeople.set(index, null);
        }
        if (cudi.equals(CUDI.i)){
            try {
                System.out.println(Solution.allPeople.get(index).getName()+" "+Solution.allPeople.get(index).getSex()+" "+(simpleDateFormat.format(Solution.allPeople.get(index).getBirthDate())));
            } catch (ExceptionInInitializerError|NullPointerException e){
                System.out.println("null");
            }
        }
    }
}
