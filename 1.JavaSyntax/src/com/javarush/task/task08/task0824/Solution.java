/*
package com.javarush.task.task08.task0824;

//import java.awt.datatransfer.MimeTypeParameterList;
import java.util.ArrayList;
import java.util.List;

*/
/*
Собираем семейство растений
*//*


public class Solution<name>{
    public static void main(String[] args) throws Exception {
        Human i1 = new Human("sss", true, 7, null);
        Human i2 = new Human("sss", true, 8, null);
        Human i3 = new Human("sss", true, 8, null);
        Human d1 = new Human("sss", true, 9, new ArrayList<>());
        Human m2 = new Human("dss", false, 9, new ArrayList<>());
        Human gd1 = new Human("ss", true, 10, new ArrayList<>());
        Human gd2 = new Human("sser", true, 10, new ArrayList<>());
        Human gm1 = new Human("ssyn", false, 10, new ArrayList<>());
        Human gm2 = new Human("sserera", false, 10, new ArrayList<>());
        System.out.println(i1.toString());
        System.out.println(i2.toString());
        System.out.println(i3.toString());
        System.out.println(d1.toString());
        System.out.println(m2.toString());
        System.out.println(gd1.toString());
        System.out.println(gd2.toString());
        System.out.println(gm1.toString());
        System.out.println(gm2.toString());

    }

    public static class Human{
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) throws Exception {
            this.name=name;
            this.sex=sex;
            this.age=age;//new ArrayList<>();
            this.children=children;
        }

        */
/*String name = this.name;
        boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<>();*//*


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
*/
