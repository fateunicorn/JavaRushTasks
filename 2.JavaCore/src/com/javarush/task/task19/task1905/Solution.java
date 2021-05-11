package com.javarush.task.task19.task1905;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        /*
        UA Ukraine
        RU Russia
        CA Canada
        */
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
    }

    public static class DataAdapter implements RowItem {

        private Customer customer;
        private Contact contact;
        /*
        public DataAdapter(Contact contact) {
        }

        public DataAdapter(Customer customer) {
        }*/

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            Set<Map.Entry<String,String>> entrySet=countries.entrySet();
//            Object desiredObject=new Object();//что хотим найти
            for (Map.Entry<String,String> pair : entrySet) {
                if (customer.getCountryName().equals(pair.getValue())) {
                    return pair.getKey();// нашли наше значение и возвращаем  ключ
                }
            }
            return null;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] s = contact.getName().split(", ");
            return s[1];
        }

        @Override
        public String getContactLastName() {
            String[] s = contact.getName().split(", ");
            return s[0];
        }

        @Override
        public String getDialString() {
            return "callto://+"+contact.getPhoneNumber().replaceAll("[\\D]", "");
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}
/*
HashMap<String,Object> map=new HashMap<String,Object>();
Set<Map.Entry<String,Object>> entrySet=map.entrySet();

Object desiredObject=new Object();//что хотим найти
for (Map.Entry<String,Object> pair : entrySet) {
    if (desiredObject.equals(pair.getValue())) {
        return pair.getKey();// нашли наше значение и возвращаем  ключ
    }
}
*/
