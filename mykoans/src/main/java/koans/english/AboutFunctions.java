package koans.english;

public class AboutFunctions {
    /**
     * # Your first function
     *
     * Write a function (also called a method) 'square' with one integer parameter 'n', which returns n multiplied by itself.
     *
     * ---------   TIPS --------------
     *
     * A function is a mini-program with a name, that you can 'call' (run) whenever you need it, as many times as you want.
     * A parameter is a value the caller gives to the function to work with. Ex:
     *
     *      public static int doubleIt(int n) {
     *          return n * 2;
     *      }
     *
     * Here, 'doubleIt' is the function's name, and 'n' is its parameter. You can call it like this:
     *
     *      int result = doubleIt(5); // result is 10
     *
     * -------------------------------
     *
     * Expected result:
     *
     * square(4) should return 16
     *
     */


    /**
     * # A function with two parameters
     *
     * Write a function 'add' with 2 integer parameters 'a' and 'b', which returns their sum.
     *
     * ---------   TIPS --------------
     *
     * A function can take more than one parameter. Simply separate them with commas. Ex:
     *
     *      public static int subtract(int a, int b) {
     *          return a - b;
     *      }
     *
     * -------------------------------
     *
     * Expected result:
     *
     * add(2, 3) should return 5
     *
     */


    /**
     * # Functions calling functions
     *
     * Using 'square', write a function 'sumOfSquares' with 2 integer parameters 'a' and 'b', which returns the sum of their squares.
     *
     * ---------   TIPS --------------
     *
     * A function can call another function. This lets you reuse work you already did instead of writing it again. Ex:
     *
     *      public static int quadruple(int n) {
     *          return double(double(n)); // reusing a 'double' function defined elsewhere
     *      }
     *
     * -------------------------------
     *
     * Expected result:
     *
     * sumOfSquares(2, 3) should return 13
     *
     */


    /**
     * # A function returning text
     *
     * Write a function 'greet' with one String parameter 'name', which returns 'Hello, [name]!'.
     *
     * ---------   TIPS --------------
     *
     * You can join text together with the '+' operator. Ex:
     *
     *      String message = "Hi " + "there"; // "Hi there"
     *
     * This also works with a variable holding text:
     *
     *      String who = "Julien";
     *      String message = "Hi " + who; // "Hi Julien"
     *
     * -------------------------------
     *
     * Expected result:
     *
     * greet("Ada") should return "Hello, Ada!"
     *
     */


    /**
     * # Picking the bigger of two numbers
     *
     * Write a function 'maxOfTwo' with 2 integer parameters 'a' and 'b', which returns the larger of the 2.
     *
     * ---------   TIPS --------------
     *
     * Java comes with many functions already written for you, in what is called its 'standard library'.
     * One of them, 'Math.max', returns the larger of its 2 parameters. Ex:
     *
     *      int bigger = Math.max(3, 7); // bigger is 7
     *
     * -------------------------------
     *
     * Expected result:
     *
     * maxOfTwo(9, 4) should return 9
     *
     */


    /**
     * # Apply your learnings: average speed
     *
     * Write a function 'averageSpeed' with 2 decimal parameters 'distance' and 'time', which returns the distance divided by the time, rounded up to the next whole number.
     *
     * ---------   TIPS --------------
     *
     * 'Math.ceil' rounds a decimal number up to the next whole number, but the result is still a decimal number. Ex:
     *
     *      double rounded = Math.ceil(3.2); // rounded is 4.0
     *
     * You can convert a decimal number to a whole number by putting its target type in parentheses in front of it. Ex:
     *
     *      int asInt = (int) 4.0; // asInt is 4
     *
     * -------------------------------
     *
     * Expected result:
     *
     * averageSpeed(10.0, 3.0) should return 4
     *
     */


}
