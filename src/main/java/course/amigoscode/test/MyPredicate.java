package course.amigoscode.test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MyPredicate {
    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(numberPhoneValid("81943399301"));
        System.out.println(numberPhoneValid("8292455666"));

        System.out.println("With predicate");
        System.out.println(numberPhoneValidPredicate.test("81943399301"));
        System.out.println(numberPhoneValidPredicate.test("8292455666"));

        System.out.println("-------");

        System.out.println(numberPhoneValidPredicate.and(containsNumber7).test("81943399301"));
        System.out.println(numberPhoneValidPredicate.and(containsNumber7).test("81943397301"));

        System.out.println("Bi Predicate");
        System.out.println(biPredicate.test("81943399301", 11));
        System.out.println(biPredicate.test("81943399301", 10));
    }


    static Predicate<String> numberPhoneValidPredicate = numberPhone -> numberPhone.startsWith("81") && numberPhone.length() == 11;

    static Predicate<String> containsNumber7 = numberPhone -> numberPhone.contains("7");

    static BiPredicate<String, Integer> biPredicate = (numberPhone, number) -> numberPhone.length() == number;

    public static boolean numberPhoneValid(String numberPhone) {
        return numberPhone.startsWith("81") && numberPhone.length() == 11;
    }
}
