import java.util.Scanner;

public class flow1{
    public static void main(String[] args){
        Scanner findResult = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        Integer result = findResult.nextInt();

        if (result < 0) {
            System.out.println("Impossible!");
        }
        else if (result >= 0 && result <= 49) {
            System.out.println("failed");            
        }
        else if (result >= 50 && result <= 59) {
            System.out.println("1");
        }
        else if (result >= 60 && result <= 69) {
            System.out.println("2");
        }
        else if (result >= 70 && result <= 79) {
            System.out.println("3");
        }
        else if (result >= 80 && result <= 89){
            System.out.println("4");
        }
        else if (result >= 90 && result <= 99){
            System.out.println("5");
        }
        else {
            System.out.println("incredible!");
        }
    }
}