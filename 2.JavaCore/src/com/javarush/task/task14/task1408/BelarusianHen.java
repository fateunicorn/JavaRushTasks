package com.javarush.task.task14.task1408;

class BelarusianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
//        <getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
        return 0;
    }
    String getDescription(){
        return super.getDescription()+" Моя страна - "+Country.BELARUS+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}