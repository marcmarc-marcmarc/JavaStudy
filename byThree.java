import java.util.Scanner;

public class byThree{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Choose a number:  ");
        int number = userInput.nextInt();

        three(number);

        userInput.close();
    }

    public static void three(int number){
        int i = 1;
        while (i < number +1){
            if (i % 3 == 0){
                System.out.println(i);
            }
            i ++;
        }
    }
}