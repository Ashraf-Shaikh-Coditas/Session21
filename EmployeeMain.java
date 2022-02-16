package Week5.Session21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//3)Write a program which differentiate the use of Comparable and Comparator for below statement:
//Write code for Employee(int id,String name,float Salary)
//Case 1: get those Employees whose  salary is greater than 15000
//Case 2: get Employees sorted by using their name.
//Try these 2 cases using comparable and comparator as well.

class Employee implements Comparable<Employee>{
    int id;
    String name;
    float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}


class sortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

class sortBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.salary-o2.salary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"Ashraf",20000));
        empList.add(new Employee(2,"Alex",10000));
        empList.add(new Employee(3,"Jack",21000));
        empList.add(new Employee(4,"Jill",16000));
        empList.add(new Employee(5,"Eoin",20000));

        System.out.println("Before sorting :: ");
        for(Employee e : empList) {
            System.out.println(e);
        }


        Collections.sort(empList,new sortBySalary());
        System.out.println("After sorting w.r.t salary using Comparator greater than 15000 .");
        for(Employee e : empList) {
            if(e.salary>15000) {
                System.out.println(e);
            }
        }

        Collections.sort(empList,new sortByName());
        System.out.println("After sorting w.r.t name using Comparator .");
        for(Employee e : empList) {
            System.out.println(e);
        }

        System.out.println("After sorting w.r.t name using Comparable .");
        Collections.sort(empList);
        for(Employee e : empList) {
                System.out.println(e);

        }

        System.out.println("Persons with salary greater than 15000");
        for(Employee e : empList) {
            if(e.salary>15000) {
                System.out.println(e);

            }
        }
    }
}

/*
Before sorting ::
Employee{id=1, name='Ashraf', salary=20000.0}
Employee{id=2, name='Alex', salary=10000.0}
Employee{id=3, name='Jack', salary=21000.0}
Employee{id=4, name='Jill', salary=16000.0}
Employee{id=5, name='Eoin', salary=20000.0}

After sorting w.r.t salary using Comparator greater than 15000 .
Employee{id=4, name='Jill', salary=16000.0}
Employee{id=1, name='Ashraf', salary=20000.0}
Employee{id=5, name='Eoin', salary=20000.0}
Employee{id=3, name='Jack', salary=21000.0}

After sorting w.r.t name using Comparator .
Employee{id=2, name='Alex', salary=10000.0}
Employee{id=1, name='Ashraf', salary=20000.0}
Employee{id=5, name='Eoin', salary=20000.0}
Employee{id=3, name='Jack', salary=21000.0}
Employee{id=4, name='Jill', salary=16000.0}

After sorting w.r.t name using Comparable .
Employee{id=2, name='Alex', salary=10000.0}
Employee{id=1, name='Ashraf', salary=20000.0}
Employee{id=5, name='Eoin', salary=20000.0}
Employee{id=3, name='Jack', salary=21000.0}
Employee{id=4, name='Jill', salary=16000.0}

Persons with salary greater than 15000
Employee{id=1, name='Ashraf', salary=20000.0}
Employee{id=5, name='Eoin', salary=20000.0}
Employee{id=3, name='Jack', salary=21000.0}
Employee{id=4, name='Jill', salary=16000.0}




* */