import java.util.ArrayList;
import java.util.Scanner;

public class Calculator implements Calculatelmpl {

    @Override
    public double getAverageValue() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter count of elements in your list:");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter" + (i + 1) + ".element:");
            int num = sc.nextInt();
            list.add(num);
        }
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        double average = (double) sum / count;
        return average;

    }

    @Override
    public int findMaxNumber() {
        int[] array = {12, 56, 112, 437, 86, 99, 23, 52, 77, 683};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial:");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public int generateFibonacciSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of numbers in Fibonacci series:");
        int n = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            System.out.print(fibonacci(i) + ",");
        }
        return fibonacci(n);
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public String getReversedText() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text:");
        String text = sc.nextLine();
        String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        return reversedText;
    }

    public boolean findPrimeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int value = sc.nextInt();
        int count = 0;
        boolean isPrime = false;
        if (value == 1) {
            System.out.println(value + "is not prime number!");
        }
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                count++;
                if (count == 2) {
                    isPrime = true;
                }
            } else isPrime = false;
        }
        return isPrime;
    }

    public boolean findPolindromeString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text:");
        String text = sc.nextLine();
        String reversedText = "";
        boolean isPolindrome = false;
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
            if (reversedText.equalsIgnoreCase(text)) {
                isPolindrome = true;
            }
        }
        return isPolindrome;
    }

    public int findElementInArray() {
        int[] list = {30, 60, 75, 102, 43, 21, 89, 56, 94};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to find in array:");
        int element = sc.nextInt();
        for (int i = 0; i < list.length; i++) {
            if (list[i] == element) {
                System.out.print("Element found in array:");
                return element;
            }
        }

        return -1;
    }
}
