import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
 * We cannot use a Stream more than one time
 * Predicate interface
 * Function interface
 * 
 * 
 * Stream interface gives many inbuilt functions: filter, map, reduce, sorted etc.
 */

class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 2, 6, 9, 4, 33, 8);

        Consumer<Integer> con = new Consumer<Integer>() {
            // accept function is compulsary
            public void accept(Integer n) {
                System.out.print(n + " ");
            }
        };

        Consumer<Integer> con1 = (Integer n) -> {
            System.out.print(n + " ");
        };

        Consumer<Integer> con2 = (Integer n) -> System.out.print(n + " ");

        Consumer<Integer> con3 = (n) -> System.out.print(n + " ");

        nums.forEach(con); // con1, con2, con3

        System.out.println("");

        nums.forEach(n -> System.out.print(n + " "));

        // Stream
        Stream<Integer> s1 = nums.stream();
        // s1.forEach(n -> System.out.print(n + " "));

        System.out.println("");

        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // s2.forEach(n -> System.out.print(n + " "));
        Stream<Integer> s3 = s2.map(n -> n * 3);
        int result = s3.reduce(0, (c, e) -> c + e);

        System.out.println(result);

        // stream method chaining
        int result1 = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 3)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result1);

        // explanation using predicate (for filter): it is a functional interface 
        // so we can use lambda expression
        Predicate<Integer> p = new Predicate<Integer>() {

            public boolean test(Integer t) {
                return t % 2 == 0;
            }

        };

        Function<Integer, Integer> fun = new Function<Integer, Integer>() {

            public Integer apply(Integer t) {
                return t*3;
            }

        };
    
        int result2 = nums.stream()
                .filter(p)
                .map(fun)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result2);

    }
}
