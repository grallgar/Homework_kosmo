package ru.astraperaspera.kc.ls4.Task1;

class Astronaut {
    String name;
    int height,  weight,  chest,  waist,  hip;
    protected Astronaut(String name, int height, int weight, int chest, int waist, int hip) { //рост, вес, обхват груди, обхват талии, размер головы
        this.name = name; //Имя
        this.height = height; //рост
        this.weight = weight; //вес
        this.chest = chest; //обхват груди
        this.waist = waist; //обхват талии
        this.hip = hip; // размер головы
    }
}