package com.walking.intensive.chapter2.task10;

//
//https://geometry-math.ru/homework/Java-palindrome.html
//

public class Task10 {
    public static void main(String[] args) {
        //System.out.println(isPalindrome("����! ������ ����� �����, �� ���������� �� �����"));
    }

    static boolean isPalindrome(String inputString) {
        //https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
        String temp = inputString.replaceAll("[\\p{Punct}+\\s+]", "").toLowerCase();
        if (temp.length() < 2) return false;

        String reverse = "";
        for (int i = temp.length() - 1; i >= 0; i--){
            reverse += temp.charAt(i);
        }

        return temp.equals(reverse);
    }
}