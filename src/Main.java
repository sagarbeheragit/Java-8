import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.List.of;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        charFrequency();//1
        removeDuplicate();//2
        filterEvenOddList();//3
        addNumbersList();//4
        longestString();//5
        wordFrequency();//6
        reverseSortedList();//7
        joinListOfStrings();//8
        multipleOf5();//9
        minMaxFromList();//10
        mergeUnsortedArrayIntoSorted();//11
        isAnagram();//12
        sumOf();//13
        sortByLengthOfList();//14
        secondLargestNumberFromList();//15
        mergeUnsortedArrayIntoSortedWithoutDuplicate();//16
        min3max3();//17
        calculateAndSumAndAverage();//18
        commonElements();//19
        reverseEachWord();//20
        reversedArray(); //21
        mostRepeatedElement();//22
        checkIsTheStringPalindrome(); //23
        stringsStartsWithNumber(); //24
        duplicateCharactersInString(); //25
        firstRepeatedCharacter(); //26
        firstNonRepeatingCharacter(); //27
        generateFibonacciSeries(); //28
        firstTenOddNumbers(); //29
        lastElementInTheArray(); //30
        calculatePersonAgeInYear();//31
        extractDuplicateElements(); //32
        
    }
    /**
     * Extract duplicate elements from an array
     * Write a Java 8 program to extract duplicate elements from an array.
     */
    private static void extractDuplicateElements() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 3);

        List<Integer> duplicates = numbers.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .collect(Collectors.toList());

        System.out.println("Duplicate elements: " + duplicates);

    }

    /**
     * Calculate the age of a person in years
     * Write a Java 8 program to calculate the age of a person in years given their birthday.
     */
    private static void calculatePersonAgeInYear() {
        LocalDate birthDate = LocalDate.of(1984, 5, 5);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        System.out.println("Age of the person is: " + age);
    }

    /**
     * Get the last element of an array
     * Write a Java 8 program to get the last element of an array.
     */
    private static void lastElementInTheArray() {
        int[] intArray = {0,1,2,3,4,5};
        System.out.println(Arrays.stream(intArray).boxed().reduce((a,b)->b)
                .get());
    }

    /**
     * Print the first 10 odd numbers
     * Write a Java 8 program to print the first 10 odd numbers.
     */
    private static void firstTenOddNumbers() {
        IntStream.rangeClosed(1,30).filter(i -> i%2 !=0)
                .limit(10)
                .map(t->t)
                .forEach(System.out::println);
    }

    /**
     * Generate the Fibonacci series
     * Write a Java 8 program to generate the Fibonacci series.
     * Explanation:
     * Stream.iterate(): This method creates an infinite stream. We start with an initial array [0, 1] representing the first two Fibonacci numbers.
     * t -> new int[]{t[1], t[0] + t[1]}: This lambda expression generates the next Fibonacci number by taking the previous two numbers from the array t
     * and creating a new array with the second number (t[1]) and the sum of the two (t[0] + t[1]).
     * .limit(10): This limits the stream to the first 10 Fibonacci numbers.
     * .map(t -> t[0]): This extracts the first element (the actual Fibonacci number) from each array in the stream.
     * .forEach(System.out::println): This prints each Fibonacci number to the console.
     */
    private static void generateFibonacciSeries() {
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .forEach(System.out::println);
    }

    /**
     * Find the first non-repeated character in a string
     * Write a Java 8 program to find the first non-repeated character in a string.
     */
    private static void firstNonRepeatingCharacter() {
        String str = "programming";
        String nonReapting = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue() ==1)
                .map(e->e.getKey()).findFirst().get().toString();
        System.out.println(nonReapting);
    }

    /**
     * Find the first repeated character in a string
     * Write a Java 8 program to find the first repeated character in a string.
     */
    private static void firstRepeatedCharacter() {
        String str = "programming";
        String repeatedFrist = str.chars()
                .mapToObj(c ->(char) c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue() > 1)
                .map(e-> e.getKey().toString())
                        .findFirst().get().toString();
        System.out.println(repeatedFrist);
    }

    /**
     * Print duplicate characters in a string
     * Write a Java 8 program to print the duplicate characters in a string.
     */
    private static void duplicateCharactersInString() {
        String str = "programming";
//        System.out.println(Arrays.stream(word.split("")).filter(s-> word.indexOf(s) != word.lastIndexOf(s))
//                .map(s -> s.charAt(0))
//                .toList());
        String duplicates = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey().toString())
                .collect(Collectors.joining());
        System.out.println(duplicates);
    }

    /**
     * Find strings in a list that start with a number
     * Given a list of strings, write a Java 8 program to find the strings that start with a number.
     */
    private static void stringsStartsWithNumber() {
        String [] words= {"rohit","foo","nemo","target1","12Target","2robot"};
        List<String> stringStartNumber = Arrays.stream(words)
                .filter(word -> Character.isDigit(word.charAt(0)))
                .toList();
        System.out.println(stringStartNumber);
    }

    /**
     * Check if a string is a palindrome using Java 8 streams
     * Write a Java 8 program to check if a given string is a palindrome using the stream API and lambda expressions.
     */
    private static void checkIsTheStringPalindrome() {
        String str = "mom";
        //String reverse = new StringBuffer(str).reverse().toString();
        String reversed = str.chars()
                .mapToObj(c -> (char)c)
                .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);

        System.out.println(str.equals(reversed));
    }

    /**
     * Find the most repeated element in an array
     * Write a Java 8 program to find the most repeated element in an array.
     */
    private static void mostRepeatedElement() {
        int[] numbers = {1, 2, 3, 2, 2, 4, 5, 2, 1, 3};
        List<Integer> nums = Arrays.asList(1,2,4,4,5,6,6,1,2,2);
        Integer most = nums.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream().max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
                                .orElseGet(null);
//        int mostRepeated = Arrays.stream(numbers)
//                .boxed()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream()
//                .max(Map.Entry.comparingByValue())
//                .map(Map.Entry::getKey)
//                .orElse(null);

        System.out.println("Most repeated element: " + most);

    }

    /**
     * Reverse an integer array
     * Write a Java 8 program to reverse an integer array.
     */
    private static void reversedArray() {
        int [] numberArray ={1,5,3,4,55,6,7,8,9,10};
        int[] reverse = IntStream.rangeClosed(1,numberArray.length)
                        .map(num -> numberArray[numberArray.length-num])
                                .toArray();
        System.out.println(Arrays.toString(reverse));
    }

    /**
     * Reverse each word of a string using Java 8 streams
     * Write a Java 8 program to reverse each word of a given string using the stream API and lambda expressions
     */
    private static void reverseEachWord() {
        String stmt = "java is OOP language";
        String reverse = Arrays.stream(stmt.split(" "))
                .map(s-> new StringBuffer(s).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reverse);
    }

    /**
     * Find the common elements between two arrays
     * Write a Java 8 program to find the common elements between two arrays using streams.
     */
    private static void commonElements() {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> twoToTen = of(2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> common = oneToTen.stream().filter(i -> twoToTen.contains(i)).toList();
        System.out.println(common);
    }

    /**
     * Find the sum and average of all elements in an integer array
     * Write a Java 8 program to find the sum and average of all elements in an integer array.
     */
    private static void calculateAndSumAndAverage() {
        int[] numbers = {1,4,5,5,6};
        Integer sum = Arrays.stream(numbers).sum();
        Double avg = Arrays.stream(numbers).average().orElse(1);
        System.out.println(sum);
        System.out.println(avg);
    }


    /**
     * Get the three maximum and three minimum numbers from a given list of integers
     * Write a Java 8 program to get the three maximum and three minimum numbers from a given list of integers.
     */
    private static void min3max3() {
        List<Integer> numbers = Arrays.asList(12,4,55,1,6,5,11,35,87,90);
        List<Integer> min3 = numbers.stream()
                .sorted()
                .limit(3)
                .toList();
        List<Integer> max3 = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3).toList();
        System.out.println(min3);
        System.out.println(max3);
    }

    /**
     * Merge two unsorted arrays into a single sorted array without duplicates
     * Write a Java 8 program to merge two unsorted arrays into a single-sorted array without duplicates.
     */
    private static void mergeUnsortedArrayIntoSortedWithoutDuplicate() {
        int [] randomNumbers ={12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43};
        int [] randomNumber2 = {4, 32, 2, 5, 6, 78, 98, 53, 90};
        int[] resultNums = IntStream.concat(Arrays.stream(randomNumbers),Arrays.stream(randomNumber2)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(resultNums));
    }

    /**
     * Find the second-largest number in an integer array
     * Write a Java 8 program to find the second-largest number in an integer array.
     */
    private static void secondLargestNumberFromList() {
        List<Integer> numbers = IntStream.rangeClosed(1,10).boxed().toList();
        Integer secLarge = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(Integer.MAX_VALUE);
        System.out.println(secLarge);
    }

    /**
     * Sort a list of strings according to the increasing order of their length
     * Write a Java 8 program to sort a given list of strings according to the increasing order of their length.
     */
    private static void sortByLengthOfList() {
        List<String> names = Arrays.asList("Sagar","Behera","Aaravi","Manvi","A");
        List<String> resultSorted = names.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(resultSorted);
    }

    /**
     * Find the sum of all digits of a number in Java 8
     * Write a Java 8 program to find the sum of all digits of a given number.
     */
    private static void sumOf() {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = oneToTen.stream().reduce(Integer::sum).get();
        System.out.println("Sum of all num : "+sum);
    }

    /**
     * Check if two strings are anagrams or not using Java 8 streams
     * Write a Java 8 program to check if two strings are anagrams or not using the stream API and lambda expressions.
     */
    private static void isAnagram() {
        String string1 = "listen";
        String string2 = "silent";
        String join1 = Arrays.stream(string1.split("")).sorted().collect(Collectors.joining(""));
        String join2 = Arrays.stream(string2.split("")).sorted().collect(Collectors.joining(""));
        System.out.println(join2.equals(join1));
    }

    /**
     * Merge two unsorted arrays into a single sorted array using Java 8 streams
     * Write a Java 8 program to merge two unsorted arrays into a single-sorted array using the stream API.
     */
    private static void mergeUnsortedArrayIntoSorted() {
        int [] randomNumbers ={12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43};
        int [] randomNumber2 = {4, 3, 2, 5, 6, 78, 98, 53, 90};
        int[] sortedArrayByMergingTwoArray = IntStream.concat(Arrays.stream(randomNumbers),Arrays.stream(randomNumber2)).sorted().toArray();
        System.out.println(Arrays.toString(sortedArrayByMergingTwoArray));
    }

    /**
     * Find the maximum and minimum of a list of integers
     * Given a list of integers, write a Java 8 program to find the maximum and minimum numbers in the list.
     */
    private static void minMaxFromList() {
        List<Integer> randomNumbers = of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        Integer maxVal = randomNumbers.stream().reduce(Integer::max).get();
        Integer minVal = randomNumbers.stream().reduce(Integer::min).get();
        System.out.println("Max : "+maxVal +" And Min Value "+minVal);

    }

    /**
     * Print the numbers from a given list of integers that are multiples of 5
     * Write a Java 8 program to print the numbers from a given list of integers that are multiples of 5.
     */
    private static void multipleOf5() {
        List<Integer> randomNumbers = of(12, 32, 2, 4, 35, 5, 32, 90, 422, 44, 99, 43);
        List<Integer> result = randomNumbers.stream().filter(i -> i%5==0).toList(); //collect(toList()) Java 8 and direct toList() Java 16
        System.out.println(result);
        //randomNumbers.stream().filter(i -> i%5==0).forEach(System.out::println);
    }

    private static void joinListOfStrings() {
        List<String> languageList = of("java", "c++", "c", "C sharp", "python", "kotlin", "scala");
        List<String> result = languageList.stream().map(s-> "["+s+"]").toList();
        String result1 = languageList.stream().collect(Collectors.joining(",","[","]"));
        System.out.println("Join Strings with [] -> "+result1);
    }

    private static void reverseSortedList() {
        List<Integer> randomNumbers = of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        List<Integer> result = randomNumbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reverse Order : "+result);
    }

    private static void wordFrequency() {
        List<String> words = Arrays.asList("Sagar","Aaravi","Sagar","Ambu");
        Map<String,Long> frequency = words.stream()
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Frequency of Words : "+frequency);
    }

    private static void charFrequency() {
        String name = "Sagar";
        Map<String,Long> result = Arrays.stream(name.split(""))
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Char Frequency :: "+result);
    }

    private static void removeDuplicate(){
        List<Integer> numbers = Arrays.asList(12,22,43,11,44,12,22,43);
        List<Integer> result = numbers.stream().distinct().toList();
        System.out.println("Removed Duplicated -> "+result);

    }

    private static void filterEvenOddList(){
        List<Integer> numbers = IntStream.rangeClosed(1,10).boxed().toList();
        Collection<List<Integer>> list = numbers.stream()
                .collect(Collectors.collectingAndThen(Collectors.partitioningBy(i -> i%2 == 0), Map::values));
        System.out.println("Even and Odd ->"+list);
    }

    private static void addNumbersList(){
        List<Integer> numbers = Arrays.asList(2,1,4,5);
        Integer sum = numbers.stream().reduce(Integer::sum).get();

        int sum1 = numbers.stream().mapToInt(i->i).sum();
        System.out.println("Sum of All Nums - "+sum + "--"+sum1);

        Integer maxValue = numbers.stream().reduce(Integer::max).get();
        System.out.println("Max value - "+maxValue);

        Integer multi = numbers.stream().reduce(1,(a,b) -> a*b);
        System.out.println("Multiply - "+multi);
    }

    /**
     * Find the longest string from the list
     */
    private static  void longestString(){
        List<String> strings = Arrays.asList("Sagar","Aaravi","Sripriya","Ambu");
        String result = strings.stream().reduce((s,d) -> s.length() > d.length()? s: d).get();
        System.out.println("Longest String in the List: "+result);
    }
}