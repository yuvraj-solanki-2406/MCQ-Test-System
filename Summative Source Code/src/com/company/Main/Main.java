package com.company.Main;

import java.io.*;
import java.util.Scanner;

public class Main {
    int finalMarks;

    public static void main(String[] args) throws IOException {
        System.out.println(" " + " " + "Welcome to MCQ test");
//Allowing user to write their name
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name :" + " ");
        String name = input.nextLine();

//Asking user to select the Question set of his choice
        System.out.println("You are required to select the set of " +
                "    questions which you are willing to give the test");
        System.out.println("Press 1 for HTML question set");
        System.out.println("Press 2 for Java question set");
        System.out.println("Press 3 for JavaScript question set");
        int set = input.nextInt();

//made the object of all the methods written in QuestionSet class
        QuestionSet questions = new QuestionSet();
        QuestionSet javaQuestions = new QuestionSet();
        QuestionSet javaScriptQuestions = new QuestionSet();
        if (set == 1) {
            System.out.println("HTML");
            questions.displayingQuestions();
            //will display question set of HTML

        } else if (set == 2) {
            System.out.println("Java");
            javaQuestions.javaQuestions();
            //will display question set of Java

        } else if (set == 3) {
            System.out.println("JavaScript");
            javaScriptQuestions.javaScript();
            //will display question set of JavaScript

        } else {
            System.out.println("Please select valid input");
        }

    }
}