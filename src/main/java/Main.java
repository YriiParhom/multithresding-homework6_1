import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String text = "генератор словаря аборигенов в функциональном стиле";
        Function<String, List<String>> function = (a) ->
                Arrays.stream(a.split(" ")).sorted().distinct().toList();
        function.apply(text).forEach(System.out::println);
    }
}
