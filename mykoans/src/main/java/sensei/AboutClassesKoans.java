package sensei;

import static engine.Assertions.assertKoanMethodIsInvokable;
import static engine.Assertions.assertNextStdOutLineEquals;
import static engine.Assertions.assertNoMoreLineInStdOut;
import static engine.Assertions.assertReturnValueEquals;
import static engine.Assertions.assertStaticMethodIsInvokable;
import static engine.script.Expression.callKoanMethod;
import static engine.script.Expression.callStaticMethod;
import static engine.text.Localizable.global;
import static engine.text.Localizable.localClass;
import static sensei.Texts.*;

import java.util.List;

import engine.Koan;
import engine.text.Localizable;

public class AboutClassesKoans {
    private static final Localizable<Class<?>> CLASS =
        localClass(koans.english.AboutClasses.class);

    public static final List<Koan> koans = List.of(
        new Koan(CLASS, CLASSES_AND_PACKAGES)
            .beforeFirstTest(
                assertStaticMethodIsInvokable("utils.MathUtils", "cube", int.class)
            )
            .when(callStaticMethod("utils.MathUtils", "cube", 2))
            .then(
                assertReturnValueEquals(8)
            )
            .when(callStaticMethod("utils.MathUtils", "cube", 3))
            .then(
                assertReturnValueEquals(27)
            )
            .when(callStaticMethod("utils.MathUtils", "cube", -2))
            .then(
                assertReturnValueEquals(-8)
            ),
        new Koan(CLASS, USING_A_DIFFERENT_CLASS)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("displayCube", int.class)
            )
            .when(callKoanMethod("displayCube", 3))
            .then(
                assertNextStdOutLineEquals(global("27")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("displayCube", 2))
            .then(
                assertNextStdOutLineEquals(global("8")),
                assertNoMoreLineInStdOut()
            ),
        new Koan(CLASS, A_CLASS_IN_A_NESTED_PACKAGE)
            .beforeFirstTest(
                assertStaticMethodIsInvokable("utils.text.TextUtils", "shout", String.class)
            )
            .when(callStaticMethod("utils.text.TextUtils", "shout", "go team"))
            .then(
                assertReturnValueEquals("GO TEAM!!!")
            )
            .when(callStaticMethod("utils.text.TextUtils", "shout", "hello"))
            .then(
                assertReturnValueEquals("HELLO!!!")
            ),
        new Koan(CLASS, USING_A_CLASS_IN_A_NESTED_PACKAGE)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("displayShout", String.class)
            )
            .when(callKoanMethod("displayShout", "go team"))
            .then(
                assertNextStdOutLineEquals(global("GO TEAM!!!")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("displayShout", "hello"))
            .then(
                assertNextStdOutLineEquals(global("HELLO!!!")),
                assertNoMoreLineInStdOut()
            )
    );
}
