package greetings.hello;
import printing.Printer;

public class Hello {

    public static void main(String[] args) {
	    System.out.println("Hello World");

        int number = 3;
        String name = "Usman";

        System.out.println(number);
        System.out.println(name);

        int[] numbers = new int [4];
        numbers[0] = 5;
        numbers[1] = 4;
        numbers[2] = 3;
        numbers[3] = 2;

        System.out.println(numbers[2]);

        Printer myPrinter = new Printer();
        myPrinter.isOn = false;
        myPrinter.modelNumber = "ABC-1245";

        Printer yourPrinter = new Printer();
        yourPrinter.isOn = true;
        yourPrinter.modelNumber = "your-printer";

        System.out.println(yourPrinter.isOn);
        System.out.println(yourPrinter.modelNumber);

        myPrinter.print();
        myPrinter.print("hello printer");

        String theModelNumber = yourPrinter.getModelNumber();
        System.out.println(theModelNumber + "is the one");

        yourPrinter.power();
        yourPrinter.power();
        yourPrinter.power();
    }
}


// Java is strongly typed.
// Types must be declared and can not change

// Types in Java

// byte
// short
// int
// long
// float
// double
// boolean
// char
// String3


// is-a and has-a relationships
// is-a => inheritance
// has-a => composition

// Polymorphism -> many forms = many forms of doing the same thing. makeNoise() =>
//
// Animal class has a makeNoise() method.
// Animal classes inherit the method.
// The result of the makeNoise() will depend on the animal class using the method.
// This is polymorphism. :D



