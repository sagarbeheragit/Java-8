package compare;

import java.util.*;

public class Compare {

    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Sagar");
        Employee e2 = new Employee(2,"Aaravi");
        Employee e3 = new Employee(4,"Sripriya");
        Employee e4 = new Employee(3,"Manvi");

        List<Employee> list = Arrays.asList(e1,e2,e3,e4);
        System.out.println(list);
        //Custom Comparator
        Collections.sort(list,new EmployeeNameComparator());
        System.out.println(list);
        //Comparable - natural order
        Collections.sort(list);
        System.out.println(list);
        // Usage with Java 8+ Lambda
        list.sort(Comparator.comparing(Employee::getName));
        System.out.println(list);
    }
}
