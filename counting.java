import java.util.Scanner;

public class counting{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("What is your number? ");
        Integer numberUser = number.nextInt();

        Integer i = 0;
        while (i < (numberUser + 1)){
            System.out.println(i);
            i ++;
        }
    }
}