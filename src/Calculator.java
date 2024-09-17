import java.util.Scanner;
import classes.Support;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to smart calculator");
        System.out.println("------------------------------");
        System.out.println("operations : ");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");
        System.out.println("5. square root");
        System.out.println("------------------------------");
        System.out.println("Choose operation(number) : ");
        int operationNumber = scanner.nextInt();
        double result = 0;
        String resultString="";
        String resultDivisionString="";
        Support supportObj = new Support();
        switch (operationNumber){
            case 1:
                supportObj.print();
                result=(double)(supportObj.firstNumber + supportObj.secondNumber);
                break;
            case 2:
                supportObj.print();
                result=(double)(supportObj.firstNumber - supportObj.secondNumber);
            break;
            case 3:
                supportObj.print();
                result=(double) (supportObj.firstNumber * supportObj.secondNumber);
            break;
            case 4:
                supportObj.print();
                if(supportObj.secondNumber == 0){
                   resultDivisionString = "undefined";
                }else {
                    result = (double) (supportObj.firstNumber / supportObj.secondNumber);
                }
            break;
            case 5:
                System.out.println("Enter the number : ");
             int firstNumber = scanner.nextInt();
                result=(double) Math.sqrt(firstNumber);
                break;
            default:
                resultString="unknown operation";
                break;
        }
        if (resultString == "unknown operation"){
            System.out.println(resultString);
        }else if(resultDivisionString == "undefined"){
            System.out.println(resultDivisionString);
        }else{
            System.out.println("The result is : "+result);
        }
    }
}