package course.amigoscode.test;

import java.util.function.Function;

public class MyFunction {
    public static void main(String[] args) {
        System.out.println(incrementByOne(2));

        Integer integer = incrementByOneFunction.apply(4);

        System.out.println(integer);
    }


    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;


    public static int incrementByOne(int number) {
        return number + 1;
    }
}
