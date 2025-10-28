package org.example;

import static java.lang.Integer.reverse;

public class Main {
    public static void main(String[] args) {
        System.out.println("isPalindrome(-1221): " + isPalindrome(-1221));
        System.out.println("isPalindrome(707): " + isPalindrome(707));
        System.out.println("isPalindrome(11212): " + isPalindrome(11212));
        System.out.println("isPalindrome(121): " + isPalindrome(121));
        System.out.println("isPalindrome(-1001): " + isPalindrome(-1001));
        System.out.println("isPalindrome(12345): " + isPalindrome(12345));
        System.out.println("*****************************************************");
        System.out.println("isPerfectNumber(6): " + isPerfectNumber(6));
        System.out.println("isPerfectNumber(28): " + isPerfectNumber(28));
        System.out.println("isPerfectNumber(5): " + isPerfectNumber(5));
        System.out.println("isPerfectNumber(1): " + isPerfectNumber(1));
        System.out.println("isPerfectNumber(-1): " + isPerfectNumber(-1));

        System.out.println("*******************************************");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int number){
        int num = Math.abs(number);
        int originalNumber = num;
        int reversedNumber = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int toplam = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                toplam += i;
            }
        }
        return toplam == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";

        String[] words = {"Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"};
        
        String numStr = Integer.toString(number);
        StringBuilder result = new StringBuilder();
        for (char c : numStr.toCharArray()) {
            int digit = c - '0';
            result.append(words[digit]).append(" ");
        }
        return result.toString().trim();
    }
}
