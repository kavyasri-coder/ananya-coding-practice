package in.kavyasri.simple_interpreter_part_two;
import in.kavyasri.simple_interpreter_part_two.service.Expr;
import java.util.Scanner;

public class CalculatorInterpreter {
    public static void main(String[] args) {
        System.out.println("This is a simple calculator - Playing around with an interpreter");

        Expr expr = new Expr();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\n\nEnter -1 to escape : $>");
            String input = scanner.nextLine();
            input=input.replaceAll(" ","");

            if (input.equalsIgnoreCase("-1")) {
                break;
            }
            Integer result = expr.evaluate(input);

            System.out.println("Sum of:" + input + " =" + result);
        }
    }
}
