package course.amigoscode.test;

import course.amigoscode.domain.Person;
import course.amigoscode.domain.enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(List.of(
                new Person("Alison", Gender.MALE),
                new Person("Bruna", Gender.FEMALE),
                new Person("Saulo", Gender.MALE),
                new Person("Rafaela", Gender.FEMALE),
                new Person("Diego", Gender.MALE),
                new Person("Caroline", Gender.FEMALE)));


        // Imperative approach

        List<Person> personFemale = new ArrayList<>();

        for (Person person : personList) {
            if (person.getGender().equals(Gender.FEMALE)) {
                personFemale.add(person);
            }
        }

        System.out.println(personFemale);

        jumpLine();

        // Declarative approach

        personList.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .forEach(System.out::println);


    }


    public static void jumpLine() {
        System.out.println("----------");
    }
}
