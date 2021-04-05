package in.kavyasri.simple_interpreter;

import  in.kavyasri.simple_interpreter.service.Expr;
import java.util.Scanner;

public class CalculatorInterpreter {
    public static void main(String[] args) {
        System.out.println("This is a simple calculator - Playing around with an interpreter");
        System.out.println("NOTE - If you want to get a single digit addition please add 0 before the digit");

        Expr expr = new Expr();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\n\nEnter -1 to escape : $>");
            String input = scanner.nextLine();
            input = input.replaceAll(" ","");

            if (input.equalsIgnoreCase("-1")) {
                break;
            }
            Integer result = expr.evaluate(input);

            System.out.println("Sum of:" + input + " =" + result);
        }
    }
}

