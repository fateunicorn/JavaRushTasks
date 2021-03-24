package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
abstract class Hen{
    abstract int getCountOfEggsPerMonth();
    String getDescription(){
        return "Я - курица.";
    }
}
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen=null;
            if (country.equals("Ukraine")) {
                hen = new UkrainianHen();
            }
            if (country.equals("Russia")) {
                hen = new RussianHen();
            }
            if (country.equals("Moldova")) {
                hen = new MoldovanHen();
            }
            if (country.equals("Belarus")) {
                hen = new BelarusianHen();
            }
            return hen;
        }
    }
/*
//    public abstract class Hen{
//        abstract int getCountOfEggsPerMonth();
//        String getDescription(){
//            return "Я - курица.";
//        }
//    }
    public class RussianHen extends Hen{
        @Override
        int getCountOfEggsPerMonth() {
            return 12000000;
        }
        String getDescription(){
            return "Я - курица.";
        }
    }
    public class UkrainianHen extends Hen{
        @Override
        int getCountOfEggsPerMonth() {
            return 2;
        }
        String getDescription(){
            return "Я - курица.";
        }
    }
    public class MoldovanHen extends Hen{
        @Override
        int getCountOfEggsPerMonth() {
            return 13000000;
        }
        String getDescription(){
            return "Я - курица.";
        }
    }
    public class BelarusianHenty extends Hen{
        @Override
        int getCountOfEggsPerMonth() {
            return 0;
        }
        String getDescription(){
            return "Я - курица.";
        }
    }
*/
}
