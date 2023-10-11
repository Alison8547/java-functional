package course.amigoscode.test;

import course.amigoscode.domain.Person;
import course.amigoscode.domain.enums.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MyOptional {
    private static List<Person> personList = new ArrayList<>(List.of(
            new Person("Alison", Gender.MALE),
            new Person("Bruna", Gender.FEMALE),
            new Person("Saulo", Gender.MALE),
            new Person("Rafaela", Gender.FEMALE),
            new Person("Diego", Gender.MALE),
            new Person("Caroline", Gender.FEMALE)));

    public static void main(String[] args) {
        Optional.of("hello")
                .ifPresent(System.out::println);

        Optional<String> empty = Optional.empty();


        System.out.println(empty);

        Optional<String> any = Optional.of("any");

        System.out.println(any.get());


        Optional<Object> nullable = Optional.ofNullable(null);

        System.out.println(nullable);


        personList.stream()
                .filter(person -> person.getName().equals("Alison"))
                .findFirst()
                .ifPresent(System.out::println);


        personList.stream()
                .filter(person -> person.getName().equals("Chris"))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not found person!"));


    }
}
