package ru.astraperaspera.kc.ls1;

public class lesson1 {
    private static String runProgramLogig(String name) {
        return ("Я - " + name + ", обязуюсь:\n"
                + "\t- прилежно комментировать свой код,\n "
                + "\t- не использовать goto,\n"
                + "\t- следить за состоянием потоков своих программ,\n"
                + "\t- контролировать выделение памяти.\n"
                + "\n"
                + "Я обязуюсь не оставлять усора в системе\n"
                + "и избегать однобуквенных переменных.\n")
                + "\t\t\t\t\t\t\t\t\tРесет.";
    }
    public static void main(String[] args) {
        String name = "Ivan";
        System.out.println(runProgramLogig(name));
    }
}

