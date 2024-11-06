
import java.util.Scanner;

public class sequal{
    public static void main(String[]args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose first number:  ");
        Integer firstNum = userInput.nextInt();
        
        System.out.println("Choose second number:  ");
        Integer secondNum = userInput.nextInt();
        Integer total = 0;

        while (firstNum < secondNum + 1){
            total += firstNum;
            firstNum ++;
        }
        System.out.println(total);
    }
}