package ru.astraperaspera.kc.ls2;

public class Viva {
    private static String text = "Viva la Java!";

    private static void printString() {
        System.out.println(text);
    }

    private static void lenghtString() {
        System.out.println(text.length());
    }
    private static void symbolString() {
        int preLastIndex = text.length() - 2; // Сдвигаем на -1 из-за того, что первый элемент "0" и вычисляем n-1
        System.out.println("Первый символ: " + text.charAt(0) + ", Предпоследний символ: " + text.charAt(preLastIndex));
    }
    private static void subString() {
        System.out.println("Подстрока: " + text.substring(7, 12));
    }

    public static void main(String[] args) {
        Viva.printString();
        Viva.lenghtString();
        Viva.symbolString();
        Viva.subString();
    }

}
