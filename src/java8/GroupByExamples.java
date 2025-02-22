package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
//https://youtu.be/k7fNLXoVCYg?si=Wx8VR7mROdgDeBDT
public class GroupByExamples {
    public static void main(String[] args) {

       List<Employee> list = List.of(
               new Employee(1,"Sagar","Dev",200000),
               new Employee(2,"Aaravi","QA",250000),
               new Employee(3,"Sripriya","QA",300000),
               new Employee(4,"Manvi","Dev",400000),
               new Employee(5,"Ammu","Dev",500000));
        //System.out.println(list);
        Map<String, List<Employee>> collect = list.stream().collect(groupingBy(Employee::getDept));
        System.out.println(collect);
        //Group By Deparment and then by highest/lowest Salary
        // Collect->Groupby-> Collect Then -> Maxby -> Optional get
        Map<String, Employee> collect1 = list.stream()
                        .collect(groupingBy(Employee::getDept
                                ,collectingAndThen(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get))
                        );
        System.out.println(collect1);


    }

}
