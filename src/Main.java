public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Average number:" + calc.getAverageValue());
        System.out.println("Max number in array:" + calc.findMaxNumber());
        System.out.println("Factorial of the given number:"+calc.findFactorial());
        System.out.println(calc.generateFibonacciSeries());
        System.out.println(calc.getReversedText());
        System.out.println(calc.findPrimeNumber());
        System.out.println(calc.findPolindromeString());
        System.out.println(calc.findElementInArray());
    }
}