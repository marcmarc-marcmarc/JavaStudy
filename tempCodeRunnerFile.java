import java.util.Scanner;

public class to100{
    public static void main(String[] args){
        Scanner userNum = new Scanner(System.in);

        System.out.println("Choose a number: ");
        Integer start = userNum.nextInt();

        while (start < 101){
            System.out.println(start);
            start ++

        }
            
    }
}