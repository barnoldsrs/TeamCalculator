

/*
* Main.java
*
* Quick 'n dirty sample to use for practicing git and IDE integration
* Skeleton for a calculator, an awkward one at that.
*
*
* */


import java.util.Scanner;

public class Main {

    private static Scanner keys;    // user input

    public static void main(String[] args)
    {
        keys = new Scanner(System.in);
        String userRsp;
        boolean keepGoing = true;
        double result = +0;

        System.out.println("Welcome to the Team-Developed Calculator");

        while (keepGoing == true)
        {
            showMenu();                     // show the choices, ask for operator (+, -, *, etc.)
            userRsp = keys.nextLine();      //
            if (userRsp.equals("q")) {
                keepGoing = false;
                continue;
            }
            System.out.println("You entered: [" + userRsp + "]");   // debug
            if (userRsp.equals("+"))                                // entered ADD
                result = goAdd();                                   // do the ADD and return the result
                                                                    // as a double.  Later operators
                                                                    // may require these methods to return
                                                                    // a String, like for logical operators
            else if (userRsp.equals("*")) {
                result = goMultiply();                              //The multiply function on the calculator
                                                                    //Accessed with "*"


            } else if (userRsp.equals("p2")){
                result = goSquare();                                //The square function on the calculator
                                                                    //Accessed with "^"


            } else if (userRsp.equals("ac")){
                result = goCircArea();                              //The area of a circle function
                                                                    //Accessed with "o"


            } else if (userRsp.equals("mod")){
                result = goModulo();                                //The Modulo function of the calculator
                                                                    //Accessed with "%"


            } else {
                result = 0.0;
            }

            System.out.printf("Result is: [%.4f]\n", result );      // print the result
            keys.nextLine();                                        // have to flush the buffer



        }
        System.out.println("\nThank you and b'bye...");
    }

    private static double goAdd()
    {
        double resultAdd;
        double operand1 = 0;
        double operand2 = 0;
        System.out.println("Please enter the two operands, separated by a space: ");
        operand1 = keys.nextDouble();
        operand2 = keys.nextDouble();
        resultAdd = operand1 + operand2;
        return resultAdd;
    }

    private static double goMultiply()
    {
        double resultMultiply;
        double operand1 = 0;
        double operand2 = 0;
        System.out.println("Please enter the two operands, separated by a space: ");
        operand1 = keys.nextDouble();
        operand2 = keys.nextDouble();
        resultMultiply = operand1 * operand2;
        return resultMultiply;
    }

    private static double goSquare() {
        double resultSquare;
        double operand1 = 0;
        System.out.println("Please enter the operand: ");
        operand1 = keys.nextDouble();
        resultSquare = operand1 * operand1;
        return resultSquare;
    }

    private static double goCircArea(){
        double resultCircArea;
        double operand1 = 0;
        System.out.println("Please enter the operand for the circle's radius: ");
        operand1 = keys.nextDouble();
        resultCircArea = operand1 * operand1 * 3.14159;
        return resultCircArea;
    }

    private static double goModulo(){
        double resultModulo;
        double operand1 = 0;
        double operand2 = 0;
        System.out.println("Please enter the two operands, separated by a space: ");
        operand1 = keys.nextDouble();
        operand2 = keys.nextDouble();
        resultModulo = operand1 % operand2;
        return resultModulo;
    }

        private static void showMenu()
    {
        System.out.println("Menu goes here.  Enter 'q' to quit. ");

    }

}
