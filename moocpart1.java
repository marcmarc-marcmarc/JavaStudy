import java.util.Scanner;
public class moocpart1{

  public static void main(String[] args) {
    Scanner ben = new Scanner(System.in);
    System.out.println("write a message:");

    String message = ben.nextLine();
    
    System.out.println("Your message was:  " + message);

  }
}