package ru.astraperaspera.kc.ls3;

public class SevenPercent {

        public static void calculate(double crewUp[]) {
                //массивы - ссылочные, новый массив создавать обязательно
                double[] crewAfter = new double[crewUp.length];
                for (int i = 0; i < crewUp.length; i++) {
                        crewAfter[i] = crewUp[i] * 0.93;
                        System.out.printf("%d член экипажа: До взноса: %.2f , После взноса: %.2f \n", i+1, crewUp[i], crewAfter[i]);
                }
        }

        public static void main(String[] args) {
                double[] crewUp = new double[] {70.00, 60.00, 55.00, 65.00, 55.00, 50.00};
                calculate(crewUp);
        }
}
