
import java.util.Scanner;

public class Main {

  Scanner in = new Scanner(System.in);


  void StartMessage() {
    System.out.println("It works!");
  }

  void WelcomeUser() {
    System.out.print("Please enter your name: ");
    String name = in.nextLine();
    System.out.println("Hi: " + name);
  }

  void AskAboutAge() {
    System.out.print("What is your age: ");
    int age = in.nextInt();
    System.out.println("You are: " + age + " years old.");

  }
  void HelloWorld() {

    System.out.println("Hello, World");
  }

  void go() {
    StartMessage();
    WelcomeUser();
    AskAboutAge();
    HelloWorld();
  }

  public static void main(String[] args) {
    new Main().go();
  }
}
