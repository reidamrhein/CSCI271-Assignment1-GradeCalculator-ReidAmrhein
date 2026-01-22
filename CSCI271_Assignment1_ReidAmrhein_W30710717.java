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

public class CSCI271_Assignment1_ReidAmrhein_W30710717 {
    public static void main(String[] args){
        double assignmentSum = 0;
        double testSum = 0;
        
        double assignment = assignmentSum / 7.0;
        double test = testSum / 7.0;

        double midterm = sc.nextDouble();
        double finalExam = sc.nextdouble();
        
        // This is what I believe is the bugfix for the syllabus, as it
        // now adds up to 70 instead of 100
        double E = (0.4 * finalExam + 0.2 * midterm + 0.1 * test) / 0.7;

        double grade;
        double weight;

        // These if statements apply the weight if necessary, if not, it calculates normally
        if (E < 60) {
            grade = E;
        }
        else if (E < 80) {
            weight = ((E - 60) 20.0) * 0.3;
            grade = (1 - weight) * E + weight * assignment;
        }
        else {
            grade = 0.4 * finalExam + 0.2 * midterm + 0.1 * test + 0.3 * assignment;
        }

        // These if statements assign a letter grade
        char letter;
        if (grade >= 90){
            letter = 'A';
        } 
        else if (grade >= 80) {
            letter = 'B';
        }
        else if (grade >= 70) {
            letter = 'C';
        }
        else if (grade >= 60) {
            letter = 'D';
        }
        else {
            letter = 'F';
        }
    }
}