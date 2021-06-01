package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        try {
            File yourFile = new File("C:\\Users\\Sergey\\Desktop\\cd2.txt");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            User user = new User();
            user.setFirstName("Rubi");
            user.setLastName("Rail");
            user.setBirthDate(new Date(1508944516168L));
            user.setMale(true);
            user.setCountry(User.Country.OTHER);
            javaRush.users.add(user);

            User user1 = new User();
            user1.setFirstName("Vase2");
            user1.setLastName("Peta2");
            user1.setBirthDate(new Date(1508944516163L));
            user1.setMale(true);
            user1.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user1);

            User user2 = new User();
            javaRush.users.add(user2);
//            System.out.println(user2.getCountry());
//            System.out.println(user2.getCountry().getDisplayName());

            User user3 = new User();
            user3.setFirstName("Solo3");
            user3.setLastName("Han3");
            user3.setBirthDate(new Date(1508944516169L));
            user3.setMale(true);
            user3.setCountry(User.Country.UKRAINE);
            javaRush.users.add(user3);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

//            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter pr = new PrintWriter(outputStream);
            for (int i = 0; i < users.size(); i++) {
                pr.println(users.get(i).getFirstName());
                pr.println(users.get(i).getLastName());
                pr.println(users.get(i).getBirthDate()!=null ?
                        users.get(i).getBirthDate().getTime() : users.get(i).getBirthDate());
                pr.println(users.get(i).isMale());
                if (i != users.size() - 1) {
                    pr.println(users.get(i).getCountry() != null ?
                            users.get(i).getCountry().getDisplayName() : users.get(i).getCountry());
                } else {
                    pr.print(users.get(i).getCountry() != null ?
                            users.get(i).getCountry().getDisplayName() : users.get(i).getCountry());
                }
            }
            pr.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            User user = new User();
            user.setFirstName(reader.readLine());
            user.setLastName(reader.readLine());
            String s = reader.readLine();
            user.setBirthDate(s!=null ?
                    new Date(Long.parseLong(s)) : new Date(0));
            user.setMale(Boolean.parseBoolean(reader.readLine()));
            try {
                user.setCountry(User.Country.valueOf(reader.readLine().toUpperCase()));
            } catch (NullPointerException e){
                user.setCountry(User.Country.OTHER);
            }
            users.add(user);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
