import java.util.stream.Stream;

public class Heron {
    public static double sqrtHeron(double a, double epsilon) {
        if (a <= 0) {
            throw new IllegalArgumentException("a muss positiv sein.");
        }

        double x0 = (a + 1) / 2.0;

        return Stream.iterate(
                        x0,
                        x -> 0.5 * (x + a / x)
                )
                .filter(x -> Math.abs(x * x - a) < epsilon)
                .findFirst()
                .orElseThrow();
    }
}
