package sensei;

import static engine.Assertions.assertKoanMethodIsInvokable;
import static engine.Assertions.assertNextStdOutLineEquals;
import static engine.Assertions.assertNoMoreLineInStdOut;
import static engine.Assertions.assertReturnValueEquals;
import static engine.script.Expression.callKoanMethod;
import static engine.text.Localizable.global;
import static engine.text.Localizable.localClass;
import static sensei.Texts.*;

import java.util.List;

import engine.Koan;
import engine.text.Localizable;

public class AboutVariablesKoans {
    private static final Localizable<Class<?>> CLASS =
        localClass(koans.english.AboutVariables.class);

    public static final List<Koan> koans = List.of(
        new Koan(CLASS, DISPLAYING_SOME_TEXT_IN_THE_CONSOLE)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("sayHiInConsole")
            )
            .when(callKoanMethod("sayHiInConsole"))
            .then(
                assertNextStdOutLineEquals(global("Hi!")),
                assertNoMoreLineInStdOut()
            ),
        new Koan(CLASS, DISPLAYING_A_CALCULATION)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("displaySum")
            )
            .when(callKoanMethod("displaySum"))
            .then(
                assertNextStdOutLineEquals(global("7")),
                assertNoMoreLineInStdOut()
            ),
        new Koan(CLASS, STORING_A_VALUE_IN_A_VARIABLE)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("displayRobotAge")
            )
            .when(callKoanMethod("displayRobotAge"))
            .then(
                assertNextStdOutLineEquals(global("14")),
                assertNoMoreLineInStdOut()
            ),
        new Koan(CLASS, STORING_TEXT_IN_A_VARIABLE)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("displayGreeting")
            )
            .when(callKoanMethod("displayGreeting"))
            .then(
                assertNextStdOutLineEquals(global("Hello, robot!")),
                assertNoMoreLineInStdOut()
            ),
        new Koan(CLASS, DOING_MATH_WITH_DECIMAL_VARIABLES)
            .beforeFirstTest(
                assertKoanMethodIsInvokable("computeRobotSpeed")
            )
            .when(callKoanMethod("computeRobotSpeed"))
            .then(
                assertReturnValueEquals(5.0)
            ),
        new Koan(CLASS, TRUE_OR_FALSE_VARIABLES)
            .beforeFirstTest(
                assertKoanMethodIsInvokable("isRobotReady")
            )
            .when(callKoanMethod("isRobotReady"))
            .then(
                assertReturnValueEquals(true)
            )
    );
}
