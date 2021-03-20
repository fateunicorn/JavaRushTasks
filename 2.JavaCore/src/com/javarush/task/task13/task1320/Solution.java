package com.javarush.task.task13.task1320;





public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static User NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User extends Matrix implements DBObject {
        long id;
        String name;
        private DBObject usa;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }

        @Override
        public User initializeIdAndName(long id, String name) {
            this.id=id;
            this.name=name;
            /*User User = new User();
            User USER = new User();
            User.id=id;
            user.name=name;
            this.NEO=user;*/
            return this;
        }
    }
}
