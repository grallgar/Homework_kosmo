package ru.astraperaspera.kc.ls4.Task2;

public class Candidate {
    String name;
    boolean nationRus, doubleNation, higherEducation, knowledgeOfEnglish, goodHealth, goodPsyQuality;
    int age, experience;

    protected Candidate (String name, boolean nationRus, boolean doubleNation, int age, boolean higherEducation,
                      int experience, boolean knowledgeOfEnglish, boolean goodHealth, boolean goodPsyQuality)
    // Имя, Российское граждданство, двойное гражданство, возраст, высшее техническое образование, опыт работы, знание английского,
    // подходящее здоровье и физические показатели, подходящие психологические показатели

    {
        this.name = name;
        this.nationRus = nationRus;
        this.doubleNation = doubleNation;
        this.higherEducation = higherEducation;
        this.knowledgeOfEnglish = knowledgeOfEnglish;
        this.goodHealth = goodHealth;
        this.goodPsyQuality = goodPsyQuality;
        this.age = age;
        this.experience = experience;
    }
}
