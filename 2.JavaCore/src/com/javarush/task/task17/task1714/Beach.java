package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public synchronized static void main(String[] args) {

    }

    volatile float ds, qs;
    @Override
    public synchronized int compareTo(Beach o) {
        /*if (be1==null) {
            be1 = o;
        } else {
            ds=be1.getDistance()-o.getDistance();
            qs=be1.getQuality()-o.getQuality();
        }
        return (int)(ds+qs);*/

        ds= -(this.getDistance()-o.getDistance());
        qs=10*(this.getQuality()-o.getQuality());
//        System.out.println((int)(ds+qs));
        return (int)(ds+qs);
    }
}
