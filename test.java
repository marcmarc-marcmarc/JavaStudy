import java.util.Scanner;

public class test{
  public static void main(String[] args){
    Scanner userinput = new Scanner(System.in);

    System.out.println("I will tell you a story, but I need some information first. \n What is the main character called?");
    String charactername = userinput.nextLine();
    System.out.println("What is their job ?");
    String characterjob = userinput.nextLine();
    System.out.println("Here is the story:");
    System.out.println("Once upon a time there was " + charactername +" , who was a " + characterjob);
    System.out.println("On the way to work, "+ charactername +" reflected on life.");
    System.out.println("Perhaps " + charactername + " will not be a builder forever.");


  }
}