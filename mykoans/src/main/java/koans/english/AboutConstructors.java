package koans.english;

public class AboutConstructors {
    /**
     * # The first object
     *
     * Create a class 'robot.Sensor' with 2 final private fields: 'name' (String) and 'maxRange' (decimal). The constructor should take 'name' and 'maxRange' as parameters.
     *
     * ---------   TIPS --------------
     *
     * Up to now, we only attached methods to classes themselves. This is useful, and allows us to organize methods in our program.
     * But classes can be much more powerful than simple 'method folders'.
     *
     * A class can serve as a template for code elements called 'objects'. Objects group together values and methods which can act on those values.
     *
     * For example, let's say we want to represent, in code, robots which can introduce themselves. A 'robot' object could have: a name, a weight, and an 'introduce' method.
     *
     * The name and weight are kind of like variables attached to the 'robot' object. Their values can be different from one 'robot' object to the other.
     * A 'variable' attached to an object is called a 'field'.
     *
     * The 'introduce' method, similarly, is attached to the object. Calling it on 2 different 'robot' objects can produce a different result.
     *
     * You create an object out of a given class by calling a very special method called a constructor. The constructor... constructs an object out of the class.
     *
     * The result of a constructor is a value, whose type is the class itself.
     * You call a constructor by using the 'new' keyword, and the name of the class.
     * Let's see how that goes with a Robot class:
     *
     *     // The constructor of Robot takes a name and a weight
     *     Robot bumblebee = new Robot("Bumblebee", 54.0);
     *     Robot ironhide = new Robot("Ironhide", 61.0);
     *
     * Now we have 2 'Robot' objects, so we can call their methods. We said 'Robot' objects have an 'introduce' method. Let's call it:
     *
     *     bumblebee.introduce();
     *
     * Result in the console:
     *
     * I am Bumblebee, and I weigh 54.0 kg
     *
     * What happens if we call the same method on the 'ironhide' object?
     *
     *     ironhide.introduce();
     *
     * Result in the console:
     *
     * I am Ironhide, and I weigh 61.0 kg
     *
     * Same method, but a different result! This is because a method attached to an object can access that object's fields, which can be different from one object to the other.
     *
     * So how do we declare fields? Like so:
     *
     *     public class Robot {
     *         // Fields go at the beginning of the class.
     *         private final String name;
     *         private final double weight;
     *
     *         public void introduce() {
     *             // In an object's method, we can use the object's field values, as if they were simple variables
     *             System.out.println("I am " + name + ", and I weigh " + weight + " kg");
     *         }
     *     }
     *
     * Like variables, fields have a type and a name. Unlike variables, we must specify whether they are visible to code outside the class.
     * Although Java allows fields to be visible outside the class, it is bad design, which often creates unintended bugs.
     * So they should always be 'private', meaning we can only use them inside the class.
     * They also should be 'final', meaning their value is assigned once, in the constructor, and will never change during an object's lifetime.
     *
     * But what about declaring the constructor itself? Constructors are very special methods.
     * They don't specify a return type, because the return type of a constructor is always the class.
     * And their name is simply the name of the class. Ex:
     *
     *     public class Robot {
     *         private final String name;
     *         private final double weight;
     *
     *         // The constructor of the class Robot
     *         // Return type: none.
     *         // Name: same as the class.
     *         public Robot(String name, double weight) {
     *             // We set the values of the object's fields in the constructor.
     *             this.name = name;
     *             this.weight = weight;
     *         }
     *
     *         public void introduce() {
     *             System.out.println("I am " + name + ", and I weigh " + weight + " kg");
     *         }
     *     }
     *
     * We use the 'this' keyword to differentiate the constructor's parameters 'name' and 'weight' from the object's fields, which have the same names.
     * 'this' is a special variable pointing to the current object. So 'this.[field name]' refers to the object's field.
     * By default, in a method, a name without 'this' refers to a parameter or local variable, not the field.
     *
     * -------------------------------
     *
     * Expected result:
     *
     * we can create a new robot.Sensor object
     *
     */


    /**
     * # An object method
     *
     * Create a method 'toString' in 'robot.Sensor' which returns a text representation of a Sensor object as follows:
     *
     * Sensor([name value], [maxRange value])
     *
     * -------------------------------
     *
     * Expected result:
     *
     * new Sensor("LIDAR", 10.0).toString() should return the String "Sensor(LIDAR, 10.0)"
     *
     */


    /**
     * # Objects with mutating fields
     *
     * Create a class 'robot.Counter' with a non-final private field 'count' (integer), initialized to 0. The constructor should take no parameters.
     * Write a method 'toString' in 'robot.Counter' which returns a text representation as follows:
     *
     * Count: [count value]
     *
     * -------------------------------
     *
     * Expected result:
     *
     * new Counter().toString() should return the String "Count: 0"
     *
     */


    /**
     * # Mutating an object's field
     *
     * Write a method 'increment' in 'robot.Counter' which takes no parameter, and increases the value of the 'count' field by 1.
     *
     * ---------   TIPS --------------
     *
     * Since 'count' is not final here, you are allowed to change its value after construction. Ex:
     *
     *     public void reset() {
     *         this.count = 0; // legal, because 'count' is not final
     *     }
     *
     * -------------------------------
     *
     * Expected result:
     *
     * The following code:
     *
     *     Counter c = new Counter();
     *     c.increment();
     *     c.increment();
     *     System.out.println(c);
     *
     * Should display:
     *
     *   Count: 2
     *
     */


    /**
     * # Objects using other objects
     *
     * Create a class 'robot.Drivetrain' with 2 final private 'Sensor' fields, 'left' and 'right'. The constructor should take 'left' and 'right' as parameters.
     * Using 'Sensor.toString', write a method 'toString' in 'robot.Drivetrain' which returns a text representation as follows:
     *
     * Drivetrain([left value], [right value])
     *
     * ---------   TIPS --------------
     *
     * When you concatenate an object with a String using '+', Java automatically calls that object's 'toString' method for you. Ex:
     *
     *     Sensor s = new Sensor("LIDAR", 10.0);
     *     String message = "We have: " + s; // "We have: Sensor(LIDAR, 10.0)"
     *
     * -------------------------------
     *
     * Expected result:
     *
     * new Drivetrain(new Sensor("LIDAR", 10.0), new Sensor("Ultrasonic", 3.0)).toString() should return the String "Drivetrain(Sensor(LIDAR, 10.0), Sensor(Ultrasonic, 3.0))"
     *
     */


}
