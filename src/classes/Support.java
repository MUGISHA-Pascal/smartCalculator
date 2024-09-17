package classes;
import java.util.Scanner;

public class Support{
  public int firstNumber=0;
  public int secondNumber=0;
        public void print() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number : ");
            this.firstNumber = scanner.nextInt();
            System.out.println("Enter the second number : ");
            this.secondNumber = scanner.nextInt();
        }
}