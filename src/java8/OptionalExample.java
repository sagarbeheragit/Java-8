package java8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String name = "Sagar";
        Optional<String> optional = Optional.ofNullable(name);
        System.out.println(optional.get());
        System.out.println(optional.orElse("Behera"));
        System.out.println(optional.orElseGet(() -> "Kumar"));
        System.out.println(optional.orElseThrow(() -> new IllegalArgumentException("Error")));
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
    }
}
