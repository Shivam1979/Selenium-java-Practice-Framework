package JavaPractice.JavaBasics.BasicsJAVA;
//Java Basics → Data types, loops, conditions, methods
//1. byte    -> 1 byte    -> Range: -128 to 127
//        2. short   -> 2 bytes   -> Range: -32,768 to 32,767
//        3. int     -> 4 bytes   -> Range: -2,147,483,648 to 2,147,483,647
//        4. long    -> 8 bytes   -> Range: Very large numbers (add 'L' at end)
//5. float   -> 4 bytes   -> Decimal numbers (add 'f' at end)
//6. double  -> 8 bytes   -> Decimal numbers (default for decimals)
//7. char    -> 2 bytes   -> Single character (e.g., 'A')
//8. boolean -> 1 bit     -> true or false

public class BasicsJava {


//🔁 Loops (5 Questions)

    //1️⃣ Print numbers from 30 to 25.
    // Use a for loop
    public static void printUpto10() {
        for (int num = 30; num >= 25; num--) {
            System.out.println(num);
        }
    }

//        2️⃣ Print even numbers between 1 and 20.
    //Write method here

    public static void evenNumers() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //        3️⃣ Find the sum of first 10 natural numbers.
    //Write method here
    public static  int naturalNumbers() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        return sum;
    }


//        4️⃣ Print the multiplication table of 5.
    //Write method here


//        5️⃣ Find the factorial of a number (e.g., 5).
    //Write method here

//

    /// /⚙️ Conditions (2 Questions)

//1️⃣ Check if a number is even or odd.
//2️⃣ Find the largest of three numbers.

//🧠 Methods (5 Questions)

//1️⃣ Write a method to add two numbers and return the result.
    public int sum(int one, int two) {
        return one + two;
    }


    //2️⃣ Write a method to check if a number is even or odd.
//3️⃣ Write a method to find factorial of a given number.
//4️⃣ Write a method to find the largest of two numbers.
//5️⃣ Write a method to check if a string is palindrome.
    public static void tanuWork() {
        //how to declare array
        int[] numbers;
        //memory allocation
        numbers = new int[5];
        // how to intiallzation
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;


        int arr[] = {1, 23, 30, 7, 5};
        System.out.println("Length : " + numbers.length);
        for (int i = 0; i < numbers.length; i = i + 2) {
            System.out.println(numbers[i]); // 10,30 , 50
        }
    }


    public static void main(String args[]) {

        naturalNumbers();
        //  evenNumers();
//        BasicsJava basicsJava = new BasicsJava();
//        System.out.println(basicsJava.sum(2, 5));
//        int val = basicsJava.naturalNumbers();
//        System.out.println(val);
    }

}
