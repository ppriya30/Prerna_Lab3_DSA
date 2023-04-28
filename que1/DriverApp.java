package lab3_DSA.que1;

import java.util.Scanner;

import static lab3_DSA.que1.StackPrarenthesis.checkExpression;

public class DriverApp {


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            try {
                System.out.println("Enter the Expression");
                String input=sc.next();
                if(checkExpression(input))
                    System.out.println("Valid Expression");
                else
                    System.out.println("Invalid Expression");

            }catch (NumberFormatException e){
                System.err.println("Caught error: numeric value required" + e.getMessage());

            }


        }
}
