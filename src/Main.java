import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello! What is your name? ");
        String name = sc.next();
        System.out.print("Welcome to Math Drill Fun Time " + name + "! This is a program where you can do fun math drills and stack up points!");
        System.out.println("Before we begin, what level would you like to play? (1/ 2/ 3): ");
        String level = sc.next();
        int level_num = Integer.parseInt(level);
        if (level_num > 6 || level_num < 0) {
            System.out.println("I'm sorry, this is not an option. You will automatically be put into 3!");
            level_num = 3;
        }
        System.out.println("You will need to solve a many questions RIGHT! Once you get it wrong, game over! Press \"s\" whenever you are ready! ");
        String start = sc.next();
        start.toLowerCase();
        if (start.equals("s")) {
            Game math = new Game(level_num);
            while(math.pointCheck() != false) {
                math.range(level_num);
                math.problem_generate();
                String givenAnswer = sc.next();
                int actualAnswer = math.answer();
                math.checkAnswer(givenAnswer, actualAnswer);
            }
        }
    }
}