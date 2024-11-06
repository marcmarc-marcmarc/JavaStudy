import java.util.Scanner;

public class printUntil{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println(" print from 1 to what number?  ");
        Integer userChoice = userInput.nextInt();
        
        printUntilNumber(userChoice);

        userInput.close();
    }

    public static void printUntilNumber(int userChoice){
        Integer i = 0;
        while (i < userChoice + 1){
            System.out.println(i);
            i ++;
        }
    }

}