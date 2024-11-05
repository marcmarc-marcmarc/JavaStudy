import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args){
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Give a number:  ");

        Integer number = numberInput.nextInt();

        if (number%2 == 0) {
            System.out.println("Number " + number + " is even.");
        }
        else {
            System.out.println("Number " + number + " is odd.");
        }
    }
}