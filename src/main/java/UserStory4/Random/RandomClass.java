package UserStory4.Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {

        RandomClass.randomQuestion();
    }


    public static void randomQuestion() {

        ArrayList<String> questionsForGroup = new ArrayList(Arrays.asList("What is Spike user story", "what is maintenance testing and who does it?", "What is the difference between UAT and system testing",
                "Name three common approaches of Agile", "What are the difference between an edge case, a corner case, a base case and a boundary case?", "Difference between error, failure, bug, defect",
                "What is scalability testing", "what is backlog increment and time box", "What three Agile approaches do you know", "What is Assertions, what are you using it for, which library are you keeping it at",
                "what are the difference between ''for'' and for each loop and while loop?","What kind of variables a class can consist of?", "What is a Local Variable?", "What is an Instance Variable?",
                "syntax of Parse method?", " What are static blocks and static initalizers in Java ?", "How to call one constructor from the other constructor ?", "What is method overriding in java ?", "What is super keyword in java ?",
                "Difference between method overloading and method overriding in java ?", "Why java is platform independent?", "difference between Parse method and valueOf method?", "What is difference between c++ and Java ?",
                "What is bytecode in java ?", "Difference between this() and super() in java ?", "What is a class ?", "What is an object ?", "What is method in java ?","Explain about main() method in java ?",
                "What is difference between length and length() method in java ?", "What is integration testing", "Are you, as a  tester doing unit testing?", "What is ASCII Code?", "What is Unicode ?",
                "Difference between Character Constant and String Constant in java ?", "What are constants and how to create constants in java?", "Difference between ‘>>’ and ‘>>>’ operators in java?",
                "What is data driven testing", "What is the approach of counting Sprints at your company ", "What does include in your test plan? Is it good for one sprint, or 1 release? 1 quarter? ",
                "what is use case", "is edge test case and boundary test case are the same? ", "What is ad hoc testing?", "What is the difference between using super and super () in a Java method?",
                "Difference between no such element exception ans Stale element exception", "What is sanity testing? Difference between sanity and regression testing", "What does <rat hole> mean in a casual Agile team conversation",
                "Why java is not 100% object oriented?", "What is an abstract class?", "an we declare a class as Abstract without having any abstract method?", "Does Importing a package imports its sub-packages as well in Java?",
                "Is it necessary for a Try Block to be followed by a Catch Block in Java for Exception handling?", "Is there any way to skip Finally block of exception even if some exception occurs in the exception block?",
               "Can a class be a super class and a sub-class at the same time? Give example", "How can we restrict inheritance for a class so that no class can be inherited from it?", "How can we use primitive data types as objects?",
                "Is JDK required on each machine to run a Java program?", "What's the difference between comparison done by equals method and == operator?", "Can a variable be local and static at the same time?",
                "In a class implementing an interface, can we change the value of any variable defined in the interface?", "I have multiple constructors defined in a class. Is it possible to call a constructor from another constructor's body?",
                "What's the base class of all exception classes?"));
        ArrayList<String> namesOfGroupmates = new ArrayList(Arrays.asList("Vadym", "Karolina", "Iryna", "Galyna"));

        Random random1 = new Random();
        Random random2 = new Random();
        int namesIndex = random2.nextInt(namesOfGroupmates.size());
        int questionsIndex = random1.nextInt(questionsForGroup.size());

        System.out.println("Name of group mate: " + namesOfGroupmates.get(namesIndex));
        System.out.println("Question: " + questionsForGroup.get(questionsIndex));
    }

}
