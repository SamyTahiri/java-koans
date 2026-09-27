package sensei;

import java.util.List;

import engine.Koan;

/**
 * All the wisdom of the master, materialized in the series of all available koans, in learning order.
 */
public final class Wisdom {
    public static final List<List<Koan>> koans = List.of(
        AboutVariablesKoans.koans,
        AboutFunctionsKoans.koans,
        AboutLoopsKoans.koans,
        AboutClassesKoans.koans,
        AboutConstructorsKoans.koans,
        AboutFinalChallengeKoans.koans
    );
}
