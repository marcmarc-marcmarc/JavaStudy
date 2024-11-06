import java.util.Scanner;

public class gifttax{
    public static void main(String[] args){
        Scanner money = new Scanner(System.in);

        System.out.println("Value of the gift? ");

        Integer value = money.nextInt();

        if (value < 5000){
            System.out.println("No tax");
        }
        else if (value >= 5000 && value < 25000){
            Double tax = 100 + (value - 5000)*0.08;
            System.out.println("Tax: " + tax);
        }

        else if (value >= 25000 && value < 55000){
            Double tax = 1700 + (value-25000) * .1;
            System.out.println("Tax: " + tax);
        }
        else if (value >= 55000 && value <200000){
            Double tax = 4700 + (value-55000)*.12;
            System.out.println("Tax: " + tax);
        }
        else if (value >= 200000 && value < 1000000) {
            Double tax = 22100 + (value - 200000)*.15;
            System.out.println("Tax: " + tax);
        }
        else {
            Double tax = 142100 + (value - 1000000)*.17;
            System.out.println("Tax: " + tax);
        }
    }
}