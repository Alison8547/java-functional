package course.amigoscode.test;

import java.util.Optional;

public class MyOptional {
    public static void main(String[] args) {
        Optional.of("hello")
                .ifPresent(System.out::println);

        Optional<String> empty = Optional.empty();


        System.out.println(empty);

        Optional<String> any = Optional.of("any");

        System.out.println(any.get());


        Optional<Object> nullable = Optional.ofNullable(null);

        System.out.println(nullable);


    }
}
