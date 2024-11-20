import java.util.Random;
import java.util.*;

public class Game{

    private int x;
    private int y;
    private List <String> operations = Arrays.asList("+", "-", "*", "/", "^");

    public Game(int level_num){
        int count = 0;
        int round = 0;
        }

    public int answer(int x, int y, String operation){
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

    public problem_generate(){
        x = rand.int;
    }
}