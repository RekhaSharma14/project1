package first_project;

//import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int [] a = {67, 55, 98, 78, 54, 217, 167, 400};
        System.out.println(a[4]);

        a[4] = 63;
        System.out.println(a[4]);

        for (int i = 0; i<=a.length-1; i++){
            if(a[i]>100) {
                System.out.println(a[i]);
            }
        }




       // for(int i =a.length-1; i >=0; i--){
        //    System.out.println(a[i]);
        //}
         //int count =0;
        int sumOfNumbers = 0;
        //for (int i = 0; i<=a.length-1; i++){
          //  if(a[i]>100) {
             //  count++;
           // }
        //}
        //System.out.println("Total no of values greater than 100: "+ count);

        for(int c:a){
            sumOfNumbers = c + sumOfNumbers;
        }
        System.out.println(sumOfNumbers);
        double mean = (double) sumOfNumbers/a.length;
        System.out.println(mean);


       // Scanner scanner = new Scanner(System.in);
        System.out.println("Number of Laps : ");
        //int noOfLaps = scanner.nextInt();
        //double [] lapTime = new double[noOfLaps];

        /*for(int i = 0; i<noOfLaps; i++{

            System.out.println("Lap times");
            lapTime[i]*/

        }










    }


