import java.util.Scanner;
public class moocpart1{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("write a message:");

    String message = scanner.nextLine();
    
    System.out.println("Your message was:  " + message);

  }
}