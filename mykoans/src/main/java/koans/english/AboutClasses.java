package koans.english;

public class AboutClasses {
    /**
     * # Classes and packages
     *
     * Create a class 'utils.MathUtils'. In this class, create a method 'cube' which takes an integer and returns its cube.
     *
     * ---------   TIPS --------------
     *
     * In Java, all your methods must go into classes. Classes are organizing methods together.
     *
     * Classes are themselves organized into folders called 'packages'.
     *
     * Packages start at the Java project root folder, generally 'src/main/java'.
     * For example, the package 'koans' is located in 'src/main/java/koans'.
     *
     * Packages can be nested in each other. For example: the package 'english' is located within the package 'koans'.
     * Classes in the package 'koans.english' go into 'src/main/java/koans/english'.
     *
     * Notice: in Java, when we need to locate something within something else, we use the dot notation.
     * For example, the class 'AboutClasses' within the 'english' package within the 'koans' package is noted:
     *
     *     koans.english.AboutClasses
     *
     * To create a class, create a file named '[class name].java' in its package folder. You may have to create the folder first if this is the first class of this package.
     *
     * For example, a 'utils.MathUtils' class would go in a 'MathUtils.java' file within the 'src/main/java/utils' folder.
     *
     * In your file, declare your class this way:
     *
     *     // The very first line must declare the class' package
     *     package utils;
     *
     *     public class MathUtils {
     *         // Methods of class MathUtils will go here
     *     }
     *
     * Reminder: the cube of a number is that number multiplied by itself 3 times.
     *
     * -------------------------------
     *
     * Expected result:
     *
     * utils.MathUtils.cube(2) should return 8
     *
     */


    /**
     * # Using a different class
     *
     * Using utils.MathUtils.cube, create a method 'displayCube' in koans.english.AboutClasses which displays the cube of a number in the console.
     *
     * ---------   TIPS --------------
     *
     * To call a method in another class, you must first 'import' that class using its full package name.
     * Imports go after the package declaration, but before the class. Ex:
     *
     *     // The package of the class you are currently creating
     *     package mypackage;
     *
     *     // Import all the classes you will be using in this file here
     *     import utils.MathUtils;
     *
     * You can then call methods on imported classes:
     *
     *     public class MyClass {
     *         public static void displayCube() {
     *             System.out.println(MathUtils.cube(2)); // Uses the imported class
     *         }
     *     }
     *
     * Note: once a class is imported, you do not need to specify its package again. Its name is enough.
     *
     * -------------------------------
     *
     * Expected result:
     *
     * displayCube(3) should display '27' in the console.
     *
     */


    /**
     * # A class in a nested package
     *
     * Create a class 'utils.text.TextUtils'. In this class, create a method 'shout' which takes a String and returns it in all capital letters, followed by '!!!'.
     *
     * ---------   TIPS --------------
     *
     * You can convert a String to all capital letters with its 'toUpperCase' method. Ex:
     *
     *      String loud = "hello".toUpperCase(); // loud is "HELLO"
     *
     * -------------------------------
     *
     * Expected result:
     *
     * utils.text.TextUtils.shout("go team") should return "GO TEAM!!!"
     *
     */


    /**
     * # Using a class in a nested package
     *
     * Using utils.text.TextUtils.shout, create a method 'displayShout' in koans.english.AboutClasses which takes a String and displays the shouted version of it in the console.
     *
     * -------------------------------
     *
     * Expected result:
     *
     * displayShout("go team") should display 'GO TEAM!!!' in the console.
     *
     */


}
