package sensei;

import static engine.Assertions.assertConstructorIsInvokable;
import static engine.Assertions.assertObjectMethodIsInvokable;
import static engine.Assertions.assertPrivateField;
import static engine.Assertions.assertPrivateFinalField;
import static engine.Assertions.assertReturnValueEquals;
import static engine.script.Expression.assignVariable;
import static engine.script.Expression.newObject;
import static engine.script.Expression.variable;
import static engine.script.Type.type;
import static engine.text.Localizable.localClass;
import static sensei.Texts.*;

import java.util.List;

import engine.Koan;
import engine.script.Type;
import engine.text.Localizable;

public class AboutConstructorsKoans {
    private static final Localizable<Class<?>> CLASS =
        localClass(koans.english.AboutConstructors.class);
    private static final Type STRING = type(String.class);
    private static final Type DOUBLE = type(double.class);
    private static final Type INT = type(int.class);
    private static final Type SENSOR = type("robot.Sensor");

    public static final List<Koan> koans = List.of(
        new Koan(CLASS, THE_FIRST_OBJECT)
            .beforeFirstTest(
                assertConstructorIsInvokable("robot.Sensor", STRING, DOUBLE),
                assertPrivateFinalField("robot.Sensor", "name", STRING),
                assertPrivateFinalField("robot.Sensor", "maxRange", DOUBLE)
            )
            .when(
                newObject("robot.Sensor", "LIDAR", 10.0)
            ),
        new Koan(CLASS, AN_OBJECT_METHOD)
            .when(
                newObject("robot.Sensor", "LIDAR", 10.0).call("toString")
            )
            .then(
                assertReturnValueEquals("Sensor(LIDAR, 10.0)")
            )
            .when(
                newObject("robot.Sensor", "Ultrasonic", 3.0).call("toString")
            )
            .then(
                assertReturnValueEquals("Sensor(Ultrasonic, 3.0)")
            ),
        new Koan(CLASS, OBJECTS_WITH_MUTATING_FIELDS)
            .beforeFirstTest(
                assertConstructorIsInvokable("robot.Counter"),
                assertPrivateField("robot.Counter", "count", INT)
            )
            .when(
                newObject("robot.Counter").call("toString")
            )
            .then(
                assertReturnValueEquals("Count: 0")
            ),
        new Koan(CLASS, MUTATING_AN_OBJECTS_FIELD)
            .beforeFirstTest(
                assertObjectMethodIsInvokable("robot.Counter", "increment")
            )
            .when(
                assignVariable("c", newObject("robot.Counter")),
                variable("c").call("increment"),
                variable("c").call("toString")
            )
            .then(
                assertReturnValueEquals("Count: 1")
            )
            .when(
                assignVariable("c", newObject("robot.Counter")),
                variable("c").call("increment"),
                variable("c").call("increment"),
                variable("c").call("toString")
            )
            .then(
                assertReturnValueEquals("Count: 2")
            ),
        new Koan(CLASS, OBJECTS_USING_OTHER_OBJECTS)
            .beforeFirstTest(
                assertConstructorIsInvokable("robot.Drivetrain", SENSOR, SENSOR),
                assertPrivateFinalField("robot.Drivetrain", "left", SENSOR),
                assertPrivateFinalField("robot.Drivetrain", "right", SENSOR)
            )
            .when(
                newObject(
                    "robot.Drivetrain",
                    newObject("robot.Sensor", "LIDAR", 10.0),
                    newObject("robot.Sensor", "Ultrasonic", 3.0)
                ).call("toString")
            )
            .then(
                assertReturnValueEquals("Drivetrain(Sensor(LIDAR, 10.0), Sensor(Ultrasonic, 3.0))")
            )
    );
}
