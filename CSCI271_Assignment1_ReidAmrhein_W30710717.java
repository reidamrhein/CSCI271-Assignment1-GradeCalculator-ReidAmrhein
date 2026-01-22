/*************************************************************************
* Assignment 1 for CSCI 271-001 Spring 2026
*
* Author: Reid Amrhein
* OS: Mac
* Compiler: javac 25.0.1
* Date: January 18, 2026
*
* Purpose
* This program calculates our grade using the calculations from the syllabus
*
*************************************************************************/

/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* <Reid Amrhein>
* <W30710717>
********************************************************************/
import java.util.Scanner;

public class CSCI271_Assignment1_ReidAmrhein_W30710717 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Student Final Grades");
        
        double assignmentSum = 0.0;
        double testSum = 0.0;

        // Reads the 7 assignment scores
        for (int i = 0; i < 7; i++) {
            assignmentSum += input.nextDouble();
        }

        // Reads the 7 test scores
        for (int i = 0; i < 7; i++) {
            testSum += input.nextDouble();
        }
        
        double assignments = assignmentSum / 7.0;
        double tests = testSum / 7.0;

        double midterm = input.nextDouble();
        double finalExam = input.nextDouble();
        // This is what I believe is the bugfix for the syllabus, as it
        // now calculates to 100 instead of 70
        double E = (0.4 * finalExam + 0.2 * midterm + 0.1 * tests) / 0.7;

        double grade;
        double weight;

        // These if statements apply the weight if necessary, if not, it calculates normally
        if (E < 60.0) {
            grade = E;
        }
        else if (E < 80.0) {
            weight = ((E - 60.0) / 20.0) * 0.3;
            grade = (1.0 - weight) * E + weight * assignments;
        }
        else {
            grade = 0.4 * finalExam + 0.2 * midterm + 0.1 * tests + 0.3 * assignments;
        }

        // These if statements assign a letter grade
        char letterGrade;
        if (grade >= 90.0){
            letterGrade = 'A';
        } 
        else if (grade >= 80.0) {
            letterGrade = 'B';
        }
        else if (grade >= 70.0) {
            letterGrade = 'C';
        }
        else if (grade >= 60.0) {
            letterGrade = 'D';
        }
        else {
            letterGrade = 'F';
        }

        // Prints the final numeric and letter grade
        // Found out the hard way Java does NOT take 2 arguments in print statements
        System.out.println("Final Numeric Grade: " + grade);
        System.out.println("Final Letter Grade: " + letterGrade);
        
        // closes the scanner
        input.close();
    }
}