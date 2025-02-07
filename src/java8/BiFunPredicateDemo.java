package java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate = (a,b) ->  a > b;
        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> a*b;
        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a+b);
        System.out.println(biPredicate.test(2,3));
        System.out.println(biFunction.apply(5,6));
        biConsumer.accept(4,7);
    }


}
