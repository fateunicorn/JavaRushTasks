package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader fileReader1 = new BufferedReader(new FileReader(args[0]));
        SortedMap<String, Date> persons = new TreeMap();

        SimpleDateFormat dateFormat = new SimpleDateFormat("d M y");

        while (fileReader1.ready()){
            String[] elements = fileReader1.readLine().split(" ");
            String sDate = elements[elements.length-3]+" "+elements[elements.length-2]+" "+elements[elements.length-1];
            Date date = dateFormat.parse(sDate);
            String sName = elements[0];
            for (int i = 1; i < elements.length - 3; i++) {
                sName = sName+" "+elements[i];
            }
            PEOPLE.add(new Person(sName, date));
        }

        /*for (int i = 0; i < PEOPLE.size(); i++) {
            System.out.println(PEOPLE.get(i).getName() + " " + PEOPLE.get(i).getBirthDate());
        }*/

        fileReader1.close();
    }
}
