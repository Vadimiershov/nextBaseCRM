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

        ArrayList<String> questionsForGroup = new ArrayList<>(Arrays.asList("What is Spike user story", "what is maintenance testing and who does it?", "What is the difference between UAT and system testing", "Name three common approaches of Agile", "What are the difference between an edge case, a corner case, a base case and a boundary case?", "Difference between error, failure, bug, defect", "What is scalability testing", "what is backlog increment and time box", "What three Agile approaches do you know",
                "What is Assertions, what are you using it for, which library are you keeping it at", "what are the difference between ''for'' and \"for each\" loop and \"while\" loop?","What kind of variables a class can consist of?", "What is a Local Variable?", "What is an Instance Variable?", "syntax of Parse method?", " What are static blocks and static initalizers in Java ?", "How to call one constructor from the other constructor ?", "What is method overriding in java ?", "What is super keyword in java ?", "Difference between method overloading and method overriding in java ?",
               "Why java is platform independent?", "difference between Parse method and valueOf method?", "What is difference between c++ and Java ?", "What is bytecode in java ?", "Difference between this() and super() in java ?", "What is a class ?", "What is an object ?", "What is method in java ?","Explain about main() method in java ?", "What is difference between length and length() method in java ?", "What is integration testing", "Are you, as a  tester doing unit testing?", "What is ASCII Code?", "What is Unicode ?", "Difference between Character Constant and String Constant in java ?", "What are constants and how to create constants in java?", "Difference between ‘>>’ and ‘>>>’ operators in java?"));
        ArrayList<String> namesOfGroupmates = new ArrayList<>(Arrays.asList("Vadym", "Karolina", "Simai", "Polina", "Oleg", "Galyna"));

        Random random1 = new Random();
        Random random2 = new Random();
        int namesIndex = random2.nextInt(namesOfGroupmates.size());
        int questionsIndex = random1.nextInt(questionsForGroup.size());

        System.out.println("Name of group mate: " + namesOfGroupmates.get(namesIndex));
        System.out.println("Question: " + questionsForGroup.get(questionsIndex));
    }

}
