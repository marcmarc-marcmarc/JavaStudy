import java.util.Scanner;

public class division{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("CHoose a numerator:  \n");
        int numerator = userInput.nextInt();

        System.out.println("choose a denominator:  \n");
        int denominator = userInput.nextInt();

        divide(numerator, denominator);

        userInput.close();
    }

    public static void divide(int numerator, int denominator){
        System.out.println(numerator / denominator);
    }


}