package quizgame;

import java.util.Scanner;

public class QuizGame {
    /*
        Loop through the array of questions,
        List the options ,
        Get answer from user ,
        Check the user answer
        Display final score
    */


    // I used chatgpt to generate these questions
    static String[] questions = {
            "1. What is JVM?",
            "2. What is JDK?",
            "3. What is JRE?",
            "4. Difference between == and .equals()?",
            "5. What is a constructor?",
            "6. What is method overloading?",
            "7. What is method overriding?",
            "8. What is an interface?",
            "9. What is a package in Java?",
            "10. What is garbage collection?"
    };
    static String[][] options = {
            {"[A]. Java Virtual Machine", "[B] Java Verified Manager", "[C] Just Virtual Memory", "[D] None"},
            {"[A] Java Debugging Kit", "[B] Java Development Kit", "[C] Java Drawing Kernel", "[D] None"},
            {"[A] Java Running Environment", "[B] Java Runtime Environment", "[C] Java Relational Engine", "[D] None"},
            {"[A] == compares values, equals() compares references", "[B] == compares references, equals() compares values", "[C] Both compare values", "[D] None"},
            {"[A] A method to destroy objects", "[B] A method to initialize objects", "[C] A static method", "[D] None"},
            {"[A] Multiple methods with same name but different params", "[B] Redefining a parent class method", "[C] Both", "[D] None"},
            {"[A] Same method name in different classes", "[B] Redefining a parent class method in subclass", "[C] Creating many constructors", "[D] None"},
            {"[A] A class with only abstract methods", "[B] A contract that defines methods without implementation", "[C] Both", "[D] None"},
            {"[A] A collection of related classes/interfaces", "[B] A Java project", "[C] A type of method", "[D] None"},
            {"[A] Manually freeing memory", "[B] Automatic memory management", "[C] Both", "[D] None"}
    };


    static char[] answers = {'A', 'B', 'B', 'B', 'B', 'A', 'B', 'B', 'A', 'B'};


    public static void startGame() {
        int score = 0;
        char guess = ' ';
        var scanner = new Scanner(System.in);
        System.out.println("********************");
        System.out.println("Welcome to Quiz");
        System.out.println("********************");

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            var option = options[i];

            for (String str : option) {
                System.out.print(str + "\t");
            }
            System.out.println();
            System.out.print("Enter your answer: ");
            guess = scanner.next().toUpperCase().charAt(0);

            if (guess == answers[i]) {
                System.out.print("✅");
                score++;
            } else {
                System.out.print("❌");
            }
            System.out.println("\n___________________________________");
        }
        scanner.close();
        System.out.println("********************");
        System.out.println("YOUR SCORE: " + score);
        System.out.println("********************");

    }


}
