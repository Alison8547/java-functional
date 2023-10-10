package course.amigoscode.test;

import course.amigoscode.domain.Person;
import course.amigoscode.domain.enums.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(List.of(
                new Person("Alison", Gender.MALE),
                new Person("Bruna", Gender.FEMALE),
                new Person("Saulo", Gender.MALE),
                new Person("Rafaela", Gender.FEMALE),
                new Person("Diego", Gender.MALE),
                new Person("Caroline", Gender.FEMALE),
                new Person("Sara", Gender.PREFER_NOT_TO_SAY)));


        personList.stream()
                .map(Person::getGender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        personList.stream()
                .map(Person::getName)
                .mapToInt(String::length)
                .forEach(System.out::println);

        boolean match = personList.stream()
                .allMatch(person -> person.getGender().equals(Gender.FEMALE));

        System.out.println(match);


        boolean anyMatch = personList.stream()
                .anyMatch(person -> person.getGender().equals(Gender.PREFER_NOT_TO_SAY));

        System.out.println(anyMatch);
    }
}
