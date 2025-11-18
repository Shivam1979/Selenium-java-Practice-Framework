package JavaPractice.JavaBasics.OOP.classAndObject;

//Create a class Calculator with methods add(), sub(), mul(), div().
//Create an object and test all methods
public class Calculator_Q3 {
    int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    int sub(int a, int b) {
        int subtract = a - b;
        return subtract;
    }

    int mul(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    double div(int a, int b) {
        double division = 0;
        try {
            division = a / b;

        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by Zero..");
        }
        return division;
    }
}

class Run {
    public static void main(String[] args) {
        Calculator_Q3 cl = new Calculator_Q3();
        int a = cl.add(3, 5);
        double d = cl.div(7, 7);
        int m = cl.mul(3, 4);
        int s = cl.sub(10, 2);

        System.out.println(a);
        System.out.println(d);
        System.out.println(m);
        System.out.println(s);
    }
}

