import java.util.Scanner;

public class hole{
    public static void main(String[] args){
        Scanner howmany = new Scanner(System.in);
        System.out.println("How many times would you like to say it?  \n");
        Integer select = howmany.nextInt();
        
        Integer i = 0;
        while (i < select){
            printText();
            i ++;
        }
    }
    public static void printText(){
        System.out.println("In a hole in the ground there lived a method\n");
    }
}