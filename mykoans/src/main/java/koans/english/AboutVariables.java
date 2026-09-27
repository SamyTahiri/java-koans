package koans.english;

public class AboutVariables {
    /**
     * # Displaying some text in the console
     *
     * Write a method 'sayHiInConsole' which displays 'Hi!' in the console.
     *
     * ---------   TIPS --------------
     *
     * All lines of code in Java must end with the ';' character. Ex:
     *
     *      System.out.println("Apple");
     *
     * You can use the method System.out.println([some value]) to display a value in the console.
     *
     * You can tell Java that some value is text by enclosing it between double quotes. Ex:
     *
     *      "This is text"
     *
     * -------------------------------
     *
     * Expected result in the console:
     *
     * Hi!
     *
     */


    /**
     * # Displaying a calculation
     *
     * Write a method 'displaySum' which displays the result of 3 + 4 in the console.
     *
     * ---------   TIPS --------------
     *
     * You can do math directly inside println. Ex:
     *
     *      System.out.println(1 + 1); // Displays 2
     *
     * -------------------------------
     *
     * Expected result in the console:
     *
     * 7
     *
     */


    /**
     * # Storing a value in a variable
     *
     * Write a method 'displayRobotAge' which creates an integer variable named 'age' with the value 14, then displays it in the console.
     *
     * ---------   TIPS --------------
     *
     * A variable is a named box that can hold a value. To create one, you write its type, then its name, then '=', then its value. Ex:
     *
     *      int wheels = 4;
     *
     * 'int' is the type used for whole numbers. Once a variable exists, you can use its name wherever you would use its value. Ex:
     *
     *      int wheels = 4;
     *      System.out.println(wheels); // Displays 4
     *
     * -------------------------------
     *
     * Expected result in the console:
     *
     * 14
     *
     */


    /**
     * # Storing text in a variable
     *
     * Write a method 'displayGreeting' which creates a String variable named 'greeting' with the value 'Hello, robot!', then displays it in the console.
     *
     * ---------   TIPS --------------
     *
     * 'String' is the type used for text. Ex:
     *
     *      String teamName = "Robotronix";
     *      System.out.println(teamName); // Displays Robotronix
     *
     * -------------------------------
     *
     * Expected result in the console:
     *
     * Hello, robot!
     *
     */


    /**
     * # Doing math with decimal variables
     *
     * Write a method 'computeRobotSpeed' which creates a decimal variable 'distance' with the value 10.0, a decimal variable 'time' with the value 2.0,
     * a decimal variable 'speed' equal to distance divided by time, and returns 'speed'.
     *
     * ---------   TIPS --------------
     *
     * 'double' is the type used for decimal numbers. Ex:
     *
     *      double batteryVoltage = 12.6;
     *
     * You can divide 2 decimal variables with '/'. Ex:
     *
     *      double half = 10.0 / 2.0; // half is 5.0
     *
     * To return a value from a method instead of displaying it, use the 'return' keyword. Ex:
     *
     *      public static double half() {
     *          return 10.0 / 2.0;
     *      }
     *
     * -------------------------------
     *
     * Expected result:
     *
     * computeRobotSpeed() should return 5.0
     *
     */


    /**
     * # True or false variables
     *
     * Write a method 'isRobotReady' which creates a boolean variable 'batteryOk' with the value true, a boolean variable 'sensorsOk' with the value true,
     * and returns true only if both are true.
     *
     * ---------   TIPS --------------
     * 
     * 'boolean' is the type used for values which can only be 'true' or 'false'. Ex:
     *
     *      boolean isRaining = false;
     *
     * You can combine 2 booleans with '&&' ('and'). The result is true only if both sides are true. Ex:
     *
     *      boolean bothTrue = true && false; // bothTrue is false
     *
     * -------------------------------
     *
     * Expected result:
     *
     * isRobotReady() should return true
     *
     */


}
