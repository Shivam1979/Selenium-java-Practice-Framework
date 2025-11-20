package JavaPractice.JavaBasics.OOP.classAndObject;

import java.lang.reflect.Array;
import java.util.List;

/*
Create a class Employee with id, name, salary.
 Create 5 employees and print only those with salary > 40,000.
 */
public class Employee_Q4 {

    int id;
    String name;
    long salary;
    Employee_Q4 (int i, String n , long s){
       this.id = i;
       this.name = n;
       this.salary = s;
    }
    public static void main(String args[]) {
        Employee_Q4 e1 =  new Employee_Q4(1, "Tanua",38000);
        Employee_Q4 e2 = new Employee_Q4(2,"Shivam", 52000);
        Employee_Q4 e3 = new Employee_Q4(3, "Prachi", 35000);
        Employee_Q4 e4 =  new Employee_Q4(4,"AuyshiS", 24000);
        Employee_Q4 e5 = new Employee_Q4(5, "Susheel", 48000);

        Employee_Q4 employee[]  = {e1,e2,e3,e4,e5};

       for(Employee_Q4 emp :  employee){
           if (emp.salary>35000){
               System.out.println(emp.name+" "+emp.salary);
           }
       }

    }

}
