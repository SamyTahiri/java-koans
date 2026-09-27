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

public class AboutLoopsKoans {
    private static final Localizable<Class<?>> CLASS =
        localClass(koans.english.AboutLoops.class);

    public static final List<Koan> koans = List.of(
        new Koan(CLASS, FIRST_LOOP)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("helloNTimes", int.class)
            )
            .when(callKoanMethod("helloNTimes", 2))
            .then(
                assertNextStdOutLineEquals(global("Hello!")),
                assertNextStdOutLineEquals(global("Hello!")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("helloNTimes", 0))
            .then(
                assertNoMoreLineInStdOut()
            ),
        new Koan(CLASS, COUNTING_UP)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("displayNumbersUpTo", int.class)
            )
            .when(callKoanMethod("displayNumbersUpTo", 3))
            .then(
                assertNextStdOutLineEquals(global("1")),
                assertNextStdOutLineEquals(global("2")),
                assertNextStdOutLineEquals(global("3")),
                assertNoMoreLineInStdOut()
            ),
        new Koan(CLASS, COUNTING_DOWN)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("displayCountdown", int.class)
            )
            .when(callKoanMethod("displayCountdown", 3))
            .then(
                assertNextStdOutLineEquals(global("3")),
                assertNextStdOutLineEquals(global("2")),
                assertNextStdOutLineEquals(global("1")),
                assertNoMoreLineInStdOut()
            ),
        new Koan(CLASS, SUMMING_WITH_A_LOOP)
            .beforeFirstTest(
                assertKoanMethodIsInvokable("sumUpTo", int.class)
            )
            .when(callKoanMethod("sumUpTo", 5))
            .then(
                assertReturnValueEquals(15)
            )
            .when(callKoanMethod("sumUpTo", 3))
            .then(
                assertReturnValueEquals(6)
            ),
        new Koan(CLASS, MULTIPLES)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("displayMultiplesOf", int.class, int.class)
            )
            .when(callKoanMethod("displayMultiplesOf", 3, 10))
            .then(
                assertNextStdOutLineEquals(global("3")),
                assertNextStdOutLineEquals(global("6")),
                assertNextStdOutLineEquals(global("9")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("displayMultiplesOf", 4, 9))
            .then(
                assertNextStdOutLineEquals(global("4")),
                assertNextStdOutLineEquals(global("8")),
                assertNoMoreLineInStdOut()
            )
    );
}
