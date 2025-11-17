package JavaPractice.JavaBasics.OOP.classAndObject;

import java.util.ArrayList;
import java.util.List;

//Create a class Student with name, age and grade.
// Write a method printDetails() and call it using an object.
public class Student {
    String name;
    char grade;
    int age;
    public  List<String > printDetails(String n, int a , char g){
     this.name=n;
     this.age = a;
     this.grade=g;
     //   System.out.println(name +" " + grade +" "+  age );
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(String.valueOf(grade));
        list.add(String.valueOf(age));
      //  System.out.println(list);
        return list;
    }
    public static void main(String[] args) {

        Student st = new Student();
       st.printDetails("Shivam",23,'A');
       st.printDetails("Tanu",21,'B');
        System.out.println( st.printDetails("Shivam",23,'A'));

    }
}






