package first_project;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Codingchallange1 {

    public static void main(String[] args) {
      /* int x = 8;
       int y = 16;


        if (x>y){
            System.out.println("x is greater than y.\n"+ (x  -y));
        }
        else if (x<y){
            System.out.println("x is smaller than y.\n" + (y-x));

        }
        else {
            System.out.println("x and y are same.");
        }*/

        //*********************************************************

       /* int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        System.out.println("i am thinking of a no from 1 to 5. Try to guess it ");
        System.out.println(randomNumber);
        System.out.println("Guess the no : ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        if (guess == randomNumber){
            System.out.println("Correct! you are lucky.");
        }
        else {
            System.out.println("wrong! Have another go.");
            System.out.println("Your guess:");
            guess = scanner.nextInt();
            if(randomNumber == guess){
                System.out.println("Correct! You won");
            }
            else {
                System.out.println("Wrong Again! May be next time.");
            }

        }*/

        //***********************************************************88

       /*int i =0;
       do{
           i++;
           System.out.println(i);
       } while(i<5);

       while(i<7){
           System.out.println(i);
           i++;
       }*/

        Scanner scanner = new Scanner(System.in);
        String again;


        do
        {int num = ThreadLocalRandom.current().nextInt(1,7);
        System.out.println("You rolled a " + num + ".");
        System.out.println("Roll again? y/n.");
         again = scanner.next();}
        while(again.equals("y"));





    }
}
