package course.amigoscode.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MyFunction {
    public static void main(String[] args) {
        System.out.println(incrementByOne(2));

        Integer integer = incrementByOneFunction.apply(4);

        System.out.println(integer);

        Function<Integer, Integer> incrementAndMultiply = incrementByOneFunction.andThen(multiplyBy10Function);

        Integer incrementMultiply = incrementAndMultiply.apply(2);

        System.out.println(incrementMultiply);

        System.out.println(incrementAndMultiply(2, 100));
        System.out.println(incrementAndMultiplyFunction.apply(2, 100));
    }


    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementAndMultiplyFunction = (number, numMultiply) -> (number + 1) * numMultiply;

    public static int incrementByOne(int number) {
        return number + 1;
    }

    public static int incrementAndMultiply(int number, int numMultiply) {
        return (number + 1) * numMultiply;
    }
}
