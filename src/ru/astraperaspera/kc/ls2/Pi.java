package ru.astraperaspera.kc.ls2;

public class Pi {
    public static void main(String[]args){
        double roundOff = Math.round(Math.PI * 100) / 100.00;
        System.out.println("Pi is a: " + roundOff);
    }
}