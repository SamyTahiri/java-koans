package koans.english;

public class AboutFinalChallenge {
    /**
     * # The final challenge: racing robots
     *
     * These koans are a bit special, because they put everything you have learned so far into practice: variables, functions, loops, classes and constructors.
     *
     * You are going to gradually build a small simulation of 2 robots racing each other, and speeding up second after second.
     *
     * Take your time. If you get stuck, go back and re-read the koans of the previous series: everything you need is in there.
     *
     */


    /**
     * # Building the robot
     *
     * Create a class 'frc.Robot' with:
     *   - a final private field 'name' (String)
     *   - a non-final private field 'speed' (decimal), initialized to 0.0
     *
     * The constructor should take only 'name' as a parameter (the initial speed is always 0.0, so it does not need a parameter for it).
     *
     * -------------------------------
     *
     * Expected result:
     *
     * we can create a new frc.Robot object
     *
     */


    /**
     * # Checking in on the robot
     *
     * Write a method 'toString' in 'frc.Robot' which returns a text representation of a Robot object as follows:
     *
     * Robot([name value], [speed value])
     *
     * -------------------------------
     *
     * Expected result:
     *
     * new Robot("Bumblebee").toString() should return the String "Robot(Bumblebee, 0.0)"
     *
     */


    /**
     * # Accelerating, one step at a time
     *
     * Write a method 'accelerate' in 'frc.Robot' with one decimal parameter 'maxSpeed', which increases the 'speed' field by 1.0, but never above 'maxSpeed'.
     *
     * ---------   TIPS --------------
     *
     * 'Math.min' returns the smaller of its 2 parameters. You can use it to make sure a value never goes above a limit. Ex:
     *
     *      double capped = Math.min(9.0, 5.0); // capped is 5.0, since 5.0 is the smaller of the two
     *
     * -------------------------------
     *
     * Expected result:
     *
     * The following code:
     *
     *     Robot r = new Robot("Bumblebee");
     *     r.accelerate(1.5);
     *     r.accelerate(1.5);
     *     r.accelerate(1.5);
     *     System.out.println(r);
     *
     * Should display:
     *
     *   Robot(Bumblebee, 1.5)
     *
     * (the speed grows to 1.0, then to 1.5, and then stays at 1.5, since 'maxSpeed' is 1.5)
     *
     */


    /**
     * # Accelerating for several seconds
     *
     * Using 'accelerate', write a method 'accelerateFor' in 'frc.Robot' with an integer parameter 'seconds' and a decimal parameter 'maxSpeed',
     * which calls 'accelerate' once per second, for 'seconds' seconds.
     *
     * ---------   TIPS --------------
     *
     * This is where loops and object methods meet: inside your loop, call 'this.accelerate(maxSpeed)' (or simply 'accelerate(maxSpeed)') once per iteration.
     *
     * -------------------------------
     *
     * Expected result:
     *
     * The following code:
     *
     *     Robot r = new Robot("Bumblebee");
     *     r.accelerateFor(3, 10.0);
     *     System.out.println(r);
     *
     * Should display:
     *
     *   Robot(Bumblebee, 3.0)
     *
     * And the following code:
     *
     *     Robot r2 = new Robot("Ironhide");
     *     r2.accelerateFor(5, 3.0);
     *     System.out.println(r2);
     *
     * Should display:
     *
     *   Robot(Ironhide, 3.0)
     *
     * (the speed is capped at 3.0, even though 5 seconds have passed)
     *
     */


    /**
     * # The race
     *
     * Using the Robot constructor and 'accelerateFor', write a function 'raceSummary' in koans.english.AboutFinalChallenge with parameters:
     *   - 'nameA' (a String)
     *   - 'secondsA' (an integer)
     *   - 'nameB' (a String)
     *   - 'secondsB' (an integer)
     *   - 'maxSpeed' (a decimal)
     *
     * It should create a Robot named 'nameA', make it accelerate for 'secondsA' seconds, create a Robot named 'nameB', make it accelerate for 'secondsB' seconds
     * (both capped at 'maxSpeed'), and return a text summary as follows:
     *
     * [robot A's toString()] | [robot B's toString()]
     *
     * ---------   TIPS --------------
     *
     * This function does not belong to the Robot class: it is a plain function of AboutFinalChallenge, which creates and uses Robot objects internally,
     * just like 'averageSpeed' used plain numbers.
     *
     * -------------------------------
     *
     * Expected result:
     *
     * raceSummary("Ada", 3, "Grace", 5, 10.0) should return "Robot(Ada, 3.0) | Robot(Grace, 5.0)"
     *
     * raceSummary("Ada", 5, "Grace", 5, 3.0) should return "Robot(Ada, 3.0) | Robot(Grace, 3.0)"
     *
     */


    /**
     * # BONUS
     *
     * Congratulations on making it this far! You now know enough Java to build real programs.
     *
     * In Java, in order for a program to know what to run when it starts, you need a method called 'main', which must look exactly like this:
     *
     *     public static void main(String[] args) {
     *         // The code to execute when the program starts
     *     }
     *
     * For example, the Koans are running because the class you right-click on to start them contains such a method.
     *
     * Go ahead, add such a method to this AboutFinalChallenge class, and use it to call 'raceSummary' with 2 robots of your choice, and display the result in the console.
     *
     * Then right-click on AboutFinalChallenge.java in the explorer and choose 'Run Java' to watch your race unfold for real!
     *
     */

}
