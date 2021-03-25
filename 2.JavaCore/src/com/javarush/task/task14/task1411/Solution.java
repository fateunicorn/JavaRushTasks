package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution implements Person{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Person person = null;
//        String key = null;
        ArrayList<String> keys=new ArrayList<>();
        for (int i = 0; i!=41 ; i++) {
            String e = reader.readLine();
            if (!e.equals("user")&&!e.equals("loser")&&!e.equals("coder")&&!e.equals("proger")) {//"loser", "coder", "proger"
//                System.out.println("hhhhhhhh");
                break;
            }
            keys.add(e);
        }
        ArrayList<Person> persons=new ArrayList<>();
        {
            for (int i = 0; i < keys.size(); i++) {
                if(keys.get(i).equals("user")){
//                    persons.add(new User());
                    doWork(new User());
                }
                if(keys.get(i).equals("loser")){
//                    persons.add(new Loser());
                    doWork(new Loser());
                }
                if(keys.get(i).equals("coder")){
//                    persons.add(new Coder());
                    doWork(new Coder());
                }
                if(keys.get(i).equals("proger")){
//                    persons.add(new Proger());
                    doWork(new Proger());
                }
            }

            for (int i = 0; i < persons.size(); i++) {
                doWork(persons.get(i));
            }
            //doWork(person);

        }
    }

    public static void doWork(Person person) {
        if (person instanceof User){
//            User.live();
            ((Person.User) person).live();
        }
        if (person instanceof Loser){
            ((Loser) person).doNothing();
        }
        if (person instanceof Coder){
            ((Coder) person).writeCode();
        }
        if (person instanceof Proger){
            ((Proger) person).enjoy();
        }
    }
}
