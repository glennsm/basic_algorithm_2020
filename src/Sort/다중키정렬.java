package Sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 */
public class 다중키정렬 {
    public static class Employee {
        public String surname;
        public String givenname;

        public Employee(String surname, String givenname) {
            this.surname = surname;
            this.givenname = givenname;
        }
    }
    //표준라이브러리의 정렬루틴을 이용하여 surname 알파벳순, givenname 알파벳 순으로 정렬하라

    public static class EmployeeNameComparator implements Comparator<Employee> {
        public int compare(Employee e1, Employee e2) {
            int ret = e1.surname.compareToIgnoreCase(e2.surname);

            if (ret == 0) {
                ret = e1.givenname.compareToIgnoreCase(e2.givenname);
            }
            return ret;
        }
    }

    public static void sortEmployees(Employee[] employees) {
        Arrays.sort(employees, new EmployeeNameComparator());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("asdfdf3", "dfdie");
        Employee e2 = new Employee("asdf", "dfd3ie");
        Employee e3 = new Employee("asdf", "b");

        Employee[] arr = new Employee[]{e1, e2, e3};

        for (Employee e : arr) {
            System.out.println("surname : " + e.surname + ", givennvame : " + e.givenname);
        }

        sortEmployees(arr);
        System.out.println("===============");

        for (Employee e : arr) {
            System.out.println("surname : " + e.surname + ", givennvame : " + e.givenname);
        }
    }
}
