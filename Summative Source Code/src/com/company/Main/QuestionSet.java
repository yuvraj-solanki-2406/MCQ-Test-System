package com.company.Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class QuestionSet {
    String answer;
    int totalMarks = 0;

    @Override
    public String toString() {
        return "QuestionSet{" +
                "answer='" + answer + '\'' +
                '}';
    }
//This method will display the question of html
    public void displayingQuestions() throws IOException {
        BufferedReader fileReader;
        try {
            fileReader = new BufferedReader(new FileReader("C:\\Users\\hp\\IdeaProjects\\Summative MCQ\\src\\com\\company\\Main\\htmlmcq.csv"));
            String line = fileReader.readLine();
            System.out.println(line);
            while (!line.equals(null)) {
                String[] data = line.split(",");
                System.out.println(data[0]);      //this will display the question
                System.out.println(data[1]);      //this will display the 1 option
                System.out.println(data[2]);      //this will display the 2 option
                System.out.println(data[3]);      //this will display the 3 option
                System.out.println(data[4]);      //this will display the 4 option
                Scanner input = new Scanner(System.in);
                String answer = input.nextLine();
                if (answer.equals(data[5])) {
                    System.out.println("Correct Answer");
                } else {
                    System.out.println("Incorrect answer " + "correct answer is " + data[5]);
                }
                line = fileReader.readLine();
//marks will start adding from here
                if (answer.equals(data[5])) {
                    totalMarks++;
                    //System.out.println("Your Marks: "+totalMarks);
                } else {}
// this will give marks out of 100
                int finalMarks = totalMarks * 10;
                System.out.println("Your Marks out of 100 are : "+ finalMarks);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//This method will display the question of Java
    public void javaQuestions() throws IOException {
        BufferedReader javaFileReader;
        javaFileReader = new BufferedReader(new FileReader("C:\\Users\\hp\\IdeaProjects\\Summative MCQ" +
                "\\src\\com\\company\\Main\\java.csv"));
        String line = javaFileReader.readLine();
        while (!line.equals(null)) {
            String[] javaData = line.split(",");
            System.out.println(javaData[0]);  //this will display the question
            System.out.println(javaData[1]);  //this will display the 1 option
            System.out.println(javaData[2]);  //this will display the 2 option
            System.out.println(javaData[3]);  //this will display the 3 option
            System.out.println(javaData[4]);  //this will display the 4 option
            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();
            if (answer.equals(javaData[5])) {
                System.out.println("Correct Answer");
            } else {
                System.out.println("Incorrect answer " + "correct answer is " + javaData[5]);
            }
            line = javaFileReader.readLine();
//marks will start adding from here
            if (answer.equals(javaData[5])) {
                totalMarks++;
             //   System.out.println(totalMarks);
            } else {
            }
// this will give marks out of 100
            int finalMarks = totalMarks * 10;
            System.out.println("Your Marks out of 100 are : "+ finalMarks);
        }
    }

//This method will display the question of JavaScript
    public void javaScript() throws IOException {
        BufferedReader javaFileReader;
        javaFileReader = new BufferedReader(new FileReader("C:\\Users\\hp\\IdeaProjects\\Summative MCQ\\src\\com\\company\\Main\\JavaScript.csv"));
        String line = javaFileReader.readLine();
        while (!line.equals(null)) {
            String[] javaScriptData = line.split(",");
            System.out.println(javaScriptData[0]);     //this will display the question
            System.out.println(javaScriptData[1]);     //this will display the 1 option
            System.out.println(javaScriptData[2]);     //this will display the 2 option
            System.out.println(javaScriptData[3]);     //this will display the 3 option
            System.out.println(javaScriptData[4]);     //this will display the 4 option
            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();
            if (answer.equals(javaScriptData[5])) {
                System.out.println("Correct Answer");
            } else {
                System.out.println("Incorrect answer " + "correct answer is " + javaScriptData[5]);
            }
            line = javaFileReader.readLine();
//marks will start adding
            if (answer.equals(javaScriptData[5])) {
                totalMarks++;
              //  System.out.println(totalMarks);
            } else {
            }
//this will give marks out of 100
            int finalMarks = totalMarks * 10;
            System.out.println("Your Marks out of 100 are : "+ finalMarks);
        }
    }
}

