import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "\n" +
                "and will share his treasure with you. The other dragon\n" +
                "\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "\n" +
                "Which cave will you go into? (1 or 2)");

        Scanner scanthing = new Scanner(System.in);
        String answer = scanthing.nextLine();

        result(answer);
    }

    static String result(String answer){
        System.out.println("You approach the cave...\n" + "\n" +
                "It is dark and spooky...\n" + "\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n");

        int playerchoice = Integer.parseInt(answer);



        int max = 2; int min = 1;
        int range = max - min + 1;

        int rand = (int)(Math.random()*range)+min;



        if(playerchoice != 1 && playerchoice != 2){
            System.out.println("not one of the two numbers");
        }  else{
            if(playerchoice == rand){
                System.out.println("Gobbles you down in one bite!");
            } else{
                System.out.println("Gives you treasure");
            }
        }

        return "0";
    }
}
