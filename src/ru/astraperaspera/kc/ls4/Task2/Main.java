package ru.astraperaspera.kc.ls4.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Candidate> myCandidate = new ArrayList<>();
        myCandidate.add( new Candidate("Oleg", true, true, 28, true,
                7, true, true, true));
        myCandidate.add( new Candidate("Olga", true, false, 26, true,
                3, true, true, true));
        myCandidate.add( new Candidate("Anton", true, false, 32, true,
                10, true, true, true));
        for (int i = 0; i < myCandidate.size(); i++) {
            if (Boolean.FALSE.equals(myCandidate.get(i).nationRus)
                    | Boolean.TRUE.equals(myCandidate.get(i).doubleNation)
                    | Boolean.FALSE.equals(myCandidate.get(i).higherEducation)
                    | Boolean.FALSE.equals(myCandidate.get(i).nationRus)
                    | Boolean.FALSE.equals(myCandidate.get(i).knowledgeOfEnglish)
                    | Boolean.FALSE.equals(myCandidate.get(i).goodHealth)
                    | Boolean.FALSE.equals(myCandidate.get(i).goodPsyQuality)
                    | myCandidate.get(i).experience < 3
                    | myCandidate.get(i).age > 35) {
                System.out.printf("Кандидат %s не подходит!\n", myCandidate.get(i).name);
            } else {
                System.out.printf("Кандидат %s подходит!\n", myCandidate.get(i).name);
            }
        }
    }
}
