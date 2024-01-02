package first_project;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Welcome to superfast Rollercoaster!");
        System.out.print("Please enter your height in centimeter:");
        int height = scanner.nextInt();

        if (height>130 && height<210){
            System.out.println("Height accepted, Go ahead.");

        }

        else {
            System.out.println("Sorry, you don't meet the height requirement.");
        }*/

        //System.out.println("The VIP Lounge.");
       // System.out.print("Age:");
        //int age = scanner.nextInt();

      // if (age>=70 || (age>=18 && vipPassReply.equals("yes"))) {
        //    System.out.println("Thanks, go on in.");
        //}
       // else {
        //    System.out.println("Sorry, not can do.");
        //}
       /* if(age>=18){
            System.out.println("Do you have VIP pass? Yes/No:");
            String vipPassReply = scanner.next();
            if(vipPassReply.equals("yes")||age>=70){
                System.out.println("Thanks, go on in.");
            }
            else{
                System.out.println("Sorry. you must be over 70 or have a VIP pass.");
            }
        }
        else {
            System.out.println("Sorry, you must be over 18.");
        }*/
        // **************************************************
        int num = scanner.nextInt();

        switch(num){
            case 1:
                System.out.println("You entered one.");
                break;
            case 2:
                System.out.println("You entered two.");
                break;
            default:
                System.out.println("Invalid number.");

        }

       /* if (num ==1){
            System.out.println("You entered one.");
        }
        else if (num==2) {
            System.out.println("You entered two.");
        }
        else {
            System.out.println("Invalid number.");
        }*/

    }


}
