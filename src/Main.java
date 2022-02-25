import java.util.Scanner;

public class Main {

    Scanner in = new Scanner(System.in);
    String name;

    void StartMessage() {
      System.out.println("It works!");
    }
    void GreetUser(){
    System.out.print("Please enter your name: ");
    name = in.nextLine();
      System.out.println("Welcome: " + name);
  }

  void go() {
      StartMessage();
      GreetUser();
  }

  public static void main(String[] args) {
    new Main().go();
  }
}
