# Java Koans — Variables, Functions, Loops, Classes, Constructors & Final Challenge

A self-contained set of Java koans (in the spirit of FrcJavaKoans / Ruby Koans):
write code, run it, see which test fails, fix it, repeat.

## Requirements
A JDK (Java 17+). No Maven/Gradle needed — it's plain javac.

## How to run
From this folder:

```
mkdir -p bin
find src/main/java -name "*.java" > sources.txt
javac -d bin @sources.txt
java -cp bin PathToEnlightenment
```

Or, in VS Code with the "Extension Pack for Java" installed, just open this
folder, open `src/main/java/PathToEnlightenment.java`, and click "Run Java".

The program will tell you which koan is broken, in which file, and why.
Edit that file, save, re-run, and move to the next koan.

## Curriculum (in order)
1. `koans/english/AboutVariables.java` — variables, types, printing
2. `koans/english/AboutFunctions.java` — functions, parameters, return values
3. `koans/english/AboutLoops.java` — while loops
4. `koans/english/AboutClasses.java` — classes, packages, static methods
   (you will need to create `utils/MathUtils.java` and `utils/text/TextUtils.java` yourself)
5. `koans/english/AboutConstructors.java` — objects, fields, constructors
   (you will need to create `robot/Sensor.java`, `robot/Counter.java`, `robot/Drivetrain.java` yourself)
6. `koans/english/AboutFinalChallenge.java` — the capstone: build a racing-robot
   simulation combining everything above (you will need to create `frc/Robot.java` yourself)

## How it's built
- `engine/` is the koan test-runner/framework (don't touch this).
- `koans/english/*.java` is what you edit — each koan is a Javadoc comment
  describing what to build, above the (initially missing) method.
- `sensei/*Koans.java` is the answer-checking logic (no peeking!).
