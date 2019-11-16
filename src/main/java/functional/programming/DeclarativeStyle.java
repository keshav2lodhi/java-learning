package functional.programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DeclarativeStyle {

    /******* Functional programming using stream ********/
    public static int totalSelector(List<Integer> list,
                                    Function<Integer, Boolean> selector) {
        int sum = list.stream()
                .filter(selector::apply)
                .mapToInt(e -> e)
                .sum();
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(totalSelector(list, e -> e % 2 == 0));
        System.out.println(totalSelector(list, e -> true));
        System.out.println(totalSelector(list, e -> e % 2 != 0));

    }
}
