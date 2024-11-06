import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Choose your number:  ");
        Integer userNum = userInput.nextInt();

        Integer i = 1;
        Integer total = 0;

        while (i < userNum+1){
            total = i *(i+1);
            i ++;
        }
        userInput.close();
        System.out.println(total);
    }
}
