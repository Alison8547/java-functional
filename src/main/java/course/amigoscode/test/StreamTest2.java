package course.amigoscode.test;

import course.amigoscode.domain.Person;
import course.amigoscode.domain.enums.Gender;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest2 {
    private static List<Person> personList = new ArrayList<>(List.of(
            new Person("Alison", Gender.MALE, 25),
            new Person("Bruna", Gender.FEMALE, 18),
            new Person("Saulo", Gender.MALE, 30),
            new Person("Rafaela", Gender.FEMALE, 20),
            new Person("Diego", Gender.MALE, 40),
            new Person("Caroline", Gender.FEMALE, 22),
            new Person("Sara", Gender.PREFER_NOT_TO_SAY, 16)));

    public static void main(String[] args) {

        personList.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .forEach(System.out::println);


        boolean allMatch = personList.stream()
                .allMatch(person -> person.getAge() > 15);

        System.out.println(allMatch);

        personList.stream()
                .filter(person -> person.getName().startsWith("R") || person.getName().startsWith("C"))
                .forEach(System.out::println);


        String collect = personList.stream()
                .map(Person::getName)
                .collect(Collectors.joining(","));

        System.out.println(collect);

        personList.stream()
                .sorted(Comparator.comparing(Person::getName))
                .map(person -> person.getName().charAt(person.getName().length() - 1))
                .forEach(System.out::println);


        personList.stream()
                .mapToInt(Person::getAge)
                .average()
                .ifPresent(System.out::println);


        int sum = personList.stream()
                .mapToInt(Person::getAge)
                .sum();

        System.out.println(sum);


        Map<Gender, List<Person>> collect1 = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        System.out.println(collect1);
    }
}
