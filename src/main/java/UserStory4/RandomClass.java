package UserStory4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {

        RandomClass.randomQuestion();
    }


    public static void randomQuestion() {

        ArrayList<String> questionsForGroup = new ArrayList<>(Arrays.asList("What is Spike user story", "what is maintenance testing and who does it?", "What is the difference between UAT and system testing", "Name three common approaches of Agile"));
        ArrayList<String> namesOfGroupmates = new ArrayList<>(Arrays.asList("Vadym", "Karolina", "Aidai", "Simai", "Polina", "Oleg", "Nour", "Ramazan", "Zhamilia", "Iryna", "Galyna"));

        Random random1 = new Random();
        Random random2 = new Random();
        int namesIndex = random2.nextInt(namesOfGroupmates.size());
        int questionsIndex = random1.nextInt(questionsForGroup.size());

        System.out.println("Name of group mate: " + namesOfGroupmates.get(namesIndex));
        System.out.println("Question: " + questionsForGroup.get(questionsIndex));
    }

}
