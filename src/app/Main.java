package app;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;


public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Робота з анонімним классом
        System.out.println("Enter first number:\n ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:\n ");
        int secondNumber = scanner.nextInt();

        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Result: " + addition.operate(firstNumber, secondNumber) + "\n");

        // Демонстрація роботи лямбда-виразу який реалізує інтерфейс StringManipulator
        System.out.println("Enter word to test Upper Case Converter : \n");
        String inputData = scanner.next();
        StringManipulator upperCaseConverter = s -> s.toUpperCase();
        System.out.println("\nResult: " + upperCaseConverter.manipulate(inputData)+ "\n");

        // Демонстрація роботи посилання на метод countUppercase
        String originalWord = "HeLLo WoRLd";
        System.out.println("Number of capital letters in string : " + originalWord);
        Function<String, Integer> upperCaseCounter = StringListProcessor::countUppercase;
        System.out.println("Result: " + upperCaseCounter.apply(originalWord) + "\n");

        // Демонстрація роботи постачальника для генераціх чисел
        System.out.println("Enter MINIMAL and then MAXIMUM number to generate random number\n");
        int minimum = scanner.nextInt();
        int maximum = scanner.nextInt();
        Supplier<Integer> randomNumberSupplier = () -> RandomNumberGenerator.generateRandomNumber(minimum, maximum);
        System.out.println("Result: " + randomNumberSupplier.get());
    }
}

