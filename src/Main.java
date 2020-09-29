

/*
* Main.java
*
* Quick 'n dirty sample to use for practicing git and IDE integration
* Skeleton for a calculator, an awkward one at that.
*
*
* */


import java.util.Scanner;
import java.lang.Math;

public class Main {

    private static Scanner keys;    // user input

    public static void main(String[] args)
    {
        keys = new Scanner(System.in);
        String userRsp;
        boolean keepGoing = true;
        double result = +0;
        Boolean ranHelp = false;

        System.out.println("Welcome to the Team-Developed Calculator.");

        while (keepGoing == true)
        {
            ranHelp = false;
            showMenu();                     // show the choices, ask for operator (+, -, *, etc.)
            userRsp = keys.nextLine();      //
            if (userRsp.equals("q")) {
                keepGoing = false;
                continue;
            }

            System.out.println("You entered: [" + userRsp + "]");   // debug

            if(userRsp.equals("help") || userRsp.equals("Help")){
                runHelp();                                          // view the help menu
                ranHelp = true;                                     // shows available operators
            }

            if (userRsp.equals("+"))                                // entered ADD
                result = goAdd();                                   // do the ADD and return the result
                                                                    // as a double.  Later operators
                                                                    // may require these methods to return
                                                                    // a String, like for logical operators

            else if(userRsp.equals("-")) {                          //The subtract function on the calculator
                result = goSubtract();                              //Accessed with "-"

            }else if (userRsp.equals("*")) {
                result = goMultiply();                              //The multiply function on the calculator
                                                                    //Accessed with "*"

            }else if(userRsp.equals("/")){
                result = goDivide();                                //The divide function on the calculator
                                                                    //Accessed with "/"
            } else if (userRsp.equals("p2")){
                result = goSquare();                                //The square function on the calculator
                                                                    //Accessed with "^"


            } else if (userRsp.equals("ac")){
                result = goCircArea();                              //The area of a circle function
                                                                    //Accessed with "o"


            } else if (userRsp.equals("mod")) {
                result = goModulo();                                //The Modulo function of the calculator
                                                                    // Accessed with "%"

            }else if(userRsp.equals("sqrt")) {
                result = goSquareRoot();                            //The Square root funtion of the calculator
                                                                    //Accessed with "sqrt"

            }else if(userRsp.equals("vs")){
                result = goVolumeSphere();                          //The volume of a sphere funtion of the calculator
                                                                    // Accessed with "vs"

            } else {
                result = 0.0;
            }

            if(!ranHelp) {
                System.out.printf("Result is: [%.4f]\n", result);      // print the result
            }
            keys.nextLine();                                       // have to flush the buffer

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

    private static double goSubtract()
    {
        double resultSubtract;
        double operand1 = 0;
        double operand2 = 0;
        System.out.println("Please enter the two operands, separated by a space: ");
        operand1 = keys.nextDouble();
        operand2 = keys.nextDouble();
        resultSubtract = operand1 - operand2;
        return resultSubtract;
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

    public static double goDivide(){
        double resultDivide;
        double operand1 = 0;
        double operand2 = 0;
        System.out.println("Please enter the two operands, separated by a space: ");
        operand1 = keys.nextDouble();
        operand2 = keys.nextDouble();
        resultDivide = operand1 / operand2;
        return resultDivide;
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

    private static double goSquareRoot(){
        double resultSquareRoot;
        double operand1 = 0;
        System.out.println("Please enter the operand: ");
        operand1 = keys.nextDouble();
        resultSquareRoot = Math.sqrt(operand1);
        return resultSquareRoot;
    }

    private static double goVolumeSphere(){
        double resultVS;
        double operand1 = 0;
        System.out.println("Please enter the radius of the sphere: ");
        operand1 = keys.nextDouble();
        resultVS = (4/(double) 3) * 3.14159265359 * Math.pow(operand1, (double)3);
        return resultVS;
    }

    private static void runHelp(){
        System.out.println("Available functions for the calculator:");
        System.out.println("+ :: Add");
        System.out.println("- :: Subtract");
        System.out.println("* :: Multiply");
        System.out.println("/ :: Divide");
        System.out.println("p2 :: square value");
        System.out.println("sqrt :: square root value");
        System.out.println("ac :: area of a circle");
        System.out.println("vs :: volume of a sphere");
        System.out.println("mod :: get modulus\n");
        System.out.println("Press enter to continue.\n");
    }

        private static void showMenu()
    {
        System.out.println("Type 'help' for instructions.  Enter 'q' to quit. ");

    }

}
