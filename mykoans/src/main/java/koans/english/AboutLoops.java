package koans.english;

public class AboutLoops {
    /**
     * # First loop
     *
     * Write a method named 'helloNTimes' with an integer parameter 'times' which displays 'Hello!' in the console, 'times' times.
     *
     * ---------   TIPS   --------------
     *
     * To do things multiple times in Java, you can use the 'while' loop.
     * A while loop looks a lot like an if condition, except it will execute its block of code again and again while the condition stays true. Ex:
     *
     *      int times = 3;
     *      while (times > 0) {
     *          // It will take 3 executions of this block of code before the condition becomes false.
     *          // So Java will execute it 3 times, and then move on to the rest of the code.
     *          System.out.println("Still executing");
     *          // We can modify the value of an existing variable. We take advantage of this capability here.
     *          times = times - 1;
     *      }
     *
     * Note: like the 'if', within the curly brackets of a 'while', you can write any code, including other 'while's and 'if's!
     *
     * -------------------------------
     *
     * Expected result:
     *
     * helloNTimes(2) should display:
     *
     * Hello!
     * Hello!
     *
     */


    /**
     * # Counting up
     *
     * Write a method named 'displayNumbersUpTo' with an integer parameter 'n', which displays every whole number between 1 and n.
     *
     * -------------------------------
     *
     * Expected result:
     *
     * displayNumbersUpTo(3) should display:
     *
     * 1
     * 2
     * 3
     *
     */


    /**
     * # Counting down
     *
     * Write a method named 'displayCountdown' with an integer parameter 'n', which displays every whole number between n and 1, in reverse order.
     *
     * -------------------------------
     *
     * Expected result:
     *
     * displayCountdown(3) should display:
     *
     * 3
     * 2
     * 1
     *
     */


    /**
     * # Summing with a loop
     *
     * Write a method named 'sumUpTo' with an integer parameter 'n', which returns the sum of every whole number between 1 and n.
     *
     * ---------   TIPS   --------------
     *
     * You will need a variable, initialized before the loop, which accumulates the sum as the loop progresses. Ex:
     *
     *      int total = 0;
     *      int i = 1;
     *      while (i <= 3) {
     *          total = total + i;
     *          i = i + 1;
     *      }
     *      // total is now 1 + 2 + 3 = 6
     *
     * -------------------------------
     *
     * Expected result:
     *
     * sumUpTo(5) should return 15
     *
     */


    /**
     * # Multiples
     *
     * Write a method named 'displayMultiplesOf' with 2 integer parameters 'factor' and 'max', which displays every multiple of 'factor' between 1 and 'max'.
     *
     * ---------   TIPS   --------------
     *
     * The '%' operator returns the remainder of a division. A number is a multiple of 'factor' exactly when that remainder is 0. Ex:
     *
     *      int remainder = 9 % 3; // remainder is 0, so 9 is a multiple of 3
     *      int otherRemainder = 10 % 3; // otherRemainder is 1, so 10 is NOT a multiple of 3
     *
     * Inside your loop, use an 'if' to only display numbers which are multiples. An 'if' only runs its block when its condition is true. Ex:
     *
     *      if (remainder == 0) {
     *          System.out.println("It's a multiple!");
     *      }
     *
     * Note: to compare 2 numbers for equality, use '==' (not '=', which is used to assign a value to a variable).
     *
     * -------------------------------
     *
     * Expected result:
     *
     * displayMultiplesOf(3, 10) should display:
     *
     * 3
     * 6
     * 9
     *
     */


}
