package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String A1 = buffer.readLine();
        if (A1.equals(Planet.SUN)||A1.equals(Planet.EARTH)||A1.equals(Planet.MOON)){
            if (A1.equals(Planet.SUN)){
                thePlanet=Sun.getInstance();
            }
            else if (A1.equals(Planet.EARTH)){
                thePlanet=Earth.getInstance();
            }
            else if (A1.equals(Planet.MOON)){
                thePlanet=Moon.getInstance();
            }
            else thePlanet=null;
        }
    }
}
