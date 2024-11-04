import java.util.Scanner;

public class test{
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("hello world"); 
    System.out.println("What is your name?");  
    
    String name = scanner.nextLine();

    System.out.println("Your name   is:  "+name);

  
  } 
}