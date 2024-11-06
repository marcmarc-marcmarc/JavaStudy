import java.util.Scanner;

public class whereto{
    public static void main(String[] args){
        Scanner userNum = new Scanner(System.in);

        System.out.println("Where should I finish? ");
        Integer end = userNum.nextInt();
        Integer i = 0;
        
        while (i < end +1){
            System.out.println(i);
            i++;
        } 
    }

}