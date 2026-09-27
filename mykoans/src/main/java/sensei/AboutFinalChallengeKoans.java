package sensei;

import static engine.Assertions.assertConstructorIsInvokable;
import static engine.Assertions.assertKoanMethodIsInvokable;
import static engine.Assertions.assertObjectMethodIsInvokable;
import static engine.Assertions.assertPrivateField;
import static engine.Assertions.assertPrivateFinalField;
import static engine.Assertions.assertReturnValueEquals;
import static engine.script.Expression.assignVariable;
import static engine.script.Expression.callKoanMethod;
import static engine.script.Expression.newObject;
import static engine.script.Expression.variable;
import static engine.script.Type.type;
import static engine.text.Localizable.localClass;
import static sensei.Texts.*;

import java.util.List;

import engine.Koan;
import engine.script.Type;
import engine.text.Localizable;

public class AboutFinalChallengeKoans {
    private static final Localizable<Class<?>> CLASS =
        localClass(koans.english.AboutFinalChallenge.class);
    private static final Type STRING = type(String.class);
    private static final Type DOUBLE = type(double.class);

    public static final List<Koan> koans = List.of(
        new Koan(CLASS, BUILDING_THE_ROBOT)
            .beforeFirstTest(
                assertConstructorIsInvokable("frc.Robot", STRING),
                assertPrivateFinalField("frc.Robot", "name", STRING),
                assertPrivateField("frc.Robot", "speed", DOUBLE)
            )
            .when(
                newObject("frc.Robot", "Bumblebee")
            ),
        new Koan(CLASS, CHECKING_IN_ON_THE_ROBOT)
            .when(
                newObject("frc.Robot", "Bumblebee").call("toString")
            )
            .then(
                assertReturnValueEquals("Robot(Bumblebee, 0.0)")
            )
            .when(
                newObject("frc.Robot", "Ironhide").call("toString")
            )
            .then(
                assertReturnValueEquals("Robot(Ironhide, 0.0)")
            ),
        new Koan(CLASS, ACCELERATING_ONE_STEP_AT_A_TIME)
            .beforeFirstTest(
                assertObjectMethodIsInvokable("frc.Robot", "accelerate", double.class)
            )
            .when(
                assignVariable("r", newObject("frc.Robot", "Bumblebee")),
                variable("r").call("accelerate", 1.5),
                variable("r").call("accelerate", 1.5),
                variable("r").call("accelerate", 1.5),
                variable("r").call("toString")
            )
            .then(
                assertReturnValueEquals("Robot(Bumblebee, 1.5)")
            )
            .when(
                assignVariable("r", newObject("frc.Robot", "Bumblebee")),
                variable("r").call("accelerate", 10.0),
                variable("r").call("toString")
            )
            .then(
                assertReturnValueEquals("Robot(Bumblebee, 1.0)")
            ),
        new Koan(CLASS, ACCELERATING_FOR_SEVERAL_SECONDS)
            .beforeFirstTest(
                assertObjectMethodIsInvokable("frc.Robot", "accelerateFor", int.class, double.class)
            )
            .when(
                assignVariable("r", newObject("frc.Robot", "Bumblebee")),
                variable("r").call("accelerateFor", 3, 10.0),
                variable("r").call("toString")
            )
            .then(
                assertReturnValueEquals("Robot(Bumblebee, 3.0)")
            )
            .when(
                assignVariable("r", newObject("frc.Robot", "Ironhide")),
                variable("r").call("accelerateFor", 5, 3.0),
                variable("r").call("toString")
            )
            .then(
                assertReturnValueEquals("Robot(Ironhide, 3.0)")
            ),
        new Koan(CLASS, THE_RACE)
            .beforeFirstTest(
                assertKoanMethodIsInvokable("raceSummary", String.class, int.class, String.class, int.class, double.class)
            )
            .when(callKoanMethod("raceSummary", "Ada", 3, "Grace", 5, 10.0))
            .then(
                assertReturnValueEquals("Robot(Ada, 3.0) | Robot(Grace, 5.0)")
            )
            .when(callKoanMethod("raceSummary", "Ada", 5, "Grace", 5, 3.0))
            .then(
                assertReturnValueEquals("Robot(Ada, 3.0) | Robot(Grace, 3.0)")
            )
    );
}
