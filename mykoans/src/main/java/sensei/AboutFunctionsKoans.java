package sensei;

import static engine.Assertions.assertKoanMethodIsInvokable;
import static engine.Assertions.assertReturnValueEquals;
import static engine.script.Expression.callKoanMethod;
import static engine.text.Localizable.localClass;
import static sensei.Texts.*;

import java.util.List;

import engine.Koan;
import engine.text.Localizable;

public class AboutFunctionsKoans {
    private static final Localizable<Class<?>> CLASS =
        localClass(koans.english.AboutFunctions.class);

    public static final List<Koan> koans = List.of(
        new Koan(CLASS, YOUR_FIRST_FUNCTION)
            .beforeFirstTest(
                assertKoanMethodIsInvokable("square", int.class)
            )
            .when(callKoanMethod("square", 4))
            .then(
                assertReturnValueEquals(16)
            )
            .when(callKoanMethod("square", 5))
            .then(
                assertReturnValueEquals(25)
            ),
        new Koan(CLASS, A_FUNCTION_WITH_TWO_PARAMETERS)
            .beforeFirstTest(
                assertKoanMethodIsInvokable("add", int.class, int.class)
            )
            .when(callKoanMethod("add", 2, 3))
            .then(
                assertReturnValueEquals(5)
            )
            .when(callKoanMethod("add", 10, -4))
            .then(
                assertReturnValueEquals(6)
            ),
        new Koan(CLASS, FUNCTIONS_CALLING_FUNCTIONS)
            .beforeFirstTest(
                assertKoanMethodIsInvokable("sumOfSquares", int.class, int.class)
            )
            .when(callKoanMethod("sumOfSquares", 2, 3))
            .then(
                assertReturnValueEquals(13)
            )
            .when(callKoanMethod("sumOfSquares", 1, 4))
            .then(
                assertReturnValueEquals(17)
            ),
        new Koan(CLASS, A_FUNCTION_RETURNING_TEXT)
            .beforeFirstTest(
                assertKoanMethodIsInvokable("greet", String.class)
            )
            .when(callKoanMethod("greet", "Ada"))
            .then(
                assertReturnValueEquals("Hello, Ada!")
            )
            .when(callKoanMethod("greet", "Grace"))
            .then(
                assertReturnValueEquals("Hello, Grace!")
            ),
        new Koan(CLASS, PICKING_THE_BIGGER_OF_TWO_NUMBERS)
            .beforeFirstTest(
                assertKoanMethodIsInvokable("maxOfTwo", int.class, int.class)
            )
            .when(callKoanMethod("maxOfTwo", 9, 4))
            .then(
                assertReturnValueEquals(9)
            )
            .when(callKoanMethod("maxOfTwo", 2, 8))
            .then(
                assertReturnValueEquals(8)
            ),
        new Koan(CLASS, APPLY_YOUR_LEARNINGS_AVERAGE_SPEED)
            .beforeFirstTest(
                assertKoanMethodIsInvokable("averageSpeed", double.class, double.class)
            )
            .when(callKoanMethod("averageSpeed", 10.0, 3.0))
            .then(
                assertReturnValueEquals(4)
            )
            .when(callKoanMethod("averageSpeed", 12.0, 4.0))
            .then(
                assertReturnValueEquals(3)
            )
    );
}
