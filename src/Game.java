import java.util.Random;
import java.util.*;

public class Game{

    public int x;
    public int y;
    public String operation;
    private List <String> operations = Arrays.asList("+", "-", "*", "/", "^");
    public int start_x;
    public int end_x;
    public int start_y;
    public int end_y;
    public int round;
    public int count;

    public Game(int level_num){
        int count = 0;
        int round = 0;
        }
    public void range(int level_num){
        if(level_num == 1){
            start_x = 1;
            end_x = 5;
            start_y = 1;
            end_y = 3;
        }
    }

    public int answer(){
        int answer = 0;
        if(operation.equals("+")){
            answer = x+y;
        }
        else if (operation.equals("-")) {
            answer = x-y;
        }
        else if (operation.equals('*')){
            answer = x*y;
        }
        else if (operation.equals('/')){
            answer = x*y;
        }
        else if (operation.equals('^')){
            double x_dbl = (double)x;
            double y_dbl = (double)y;
            answer = (int)Math.pow(x_dbl, y_dbl);
        }
        return answer;
    }

    public void problem_generate(){
        Random rand = new Random();
        x = rand.nextInt(start_x, end_x);
        y = rand.nextInt(start_y, end_y);
        operation = operations.get(rand.nextInt(operations.size()));
        System.out.print(Integer.toString(x)+" "+ operation +" "+ Integer.toString(y)+" = ");
    }

    public void checkAnswer(String given, int answer){
        int givenInt = Integer.parseInt(given);
        if( givenInt == answer){
            System.out.println("You are correct!");
        }
    }
}