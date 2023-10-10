package course.amigoscode.test;

import java.util.List;
import java.util.function.Supplier;

public class MySupplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getDBConnectionUrlListSupplier.get());
    }

    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";


    static Supplier<List<String>> getDBConnectionUrlListSupplier = () ->
            List.of("jdbc://localhost:5432/users", "jdbc://localhost:5432/create");

    public static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }
}
