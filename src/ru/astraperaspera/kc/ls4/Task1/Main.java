package ru.astraperaspera.kc.ls4.Task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Astronaut astronaut1 = new Astronaut("Igor", 180, 90, 80, 90, 65);
        Astronaut astronaut2 = new Astronaut("Ivan", 175, 93, 100, 90, 65);
        Astronaut astronaut3 = new Astronaut("Fedor", 176, 76, 90, 90, 58);
        Astronaut astronaut4 = new Astronaut("Taras", 187, 95, 90, 80, 60);
        Astronaut astronaut5 = new Astronaut("Olga", 160, 55, 90, 60, 65);
        Astronaut astronaut6 = new Astronaut("Nikolay", 195, 100, 90, 90, 58);

        Astronaut[] Astro = new Astronaut[6];
        Astro[0] = astronaut1;
        Astro[1] = astronaut2;
        Astro[2] = astronaut3;
        Astro[3] = astronaut4;
        Astro[4] = astronaut5;
        Astro[5] = astronaut6;

        while (true) {
            System.out.println("Введите номер космонавта. Для выхода нажмите q.");
            Scanner scan = new Scanner(System.in);
            String intString = scan.nextLine();
            if (intString.matches("[1-6?]")) { //если введен корректный номер астронавта, выводим его данные
                int number = Integer.parseInt(intString) - 1;
                System.out.println("Имя: " + Astro[number].name + "\n" + "Рост: " + Astro[number].weight + "\n" + "Вес: " + Astro[number].weight + "\n" +
                        "Обхват груди: " + Astro[number].chest + "\n" + "Обхват талии: " + Astro[number].waist + "\n" + "Обхват головы: " + Astro[number].hip + "\n");
            } else if ("q".equals(intString)) { //выход по нажатию "q"
                break;
            }  else { //обработка неправильного ввода
                System.out.println("Введено некорректное значение!");
            }
        }
    }
}

