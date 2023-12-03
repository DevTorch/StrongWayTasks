package com.walking.intensive.chapter2.task9;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(getPascalTriangle(10));
    }

    static String getPascalTriangle(int n){
        //№ строки(i) == количеству элементов(j).
        //C[i, j] = C[i-1, j-1] + C[i-1, j];
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < n; i++){
            int element_ij = 1;
            //System.out.print(element_ij);
            resultString.append(element_ij);
            for (int j = 1; j <= i; j++){
                element_ij *= (i - j + 1);
                element_ij /= j;
                resultString.append(" ").append(element_ij);
                //System.out.print(" " + element_ij);
            }
            resultString.append("\n");
            //System.out.println();
        }
//        System.out.println(resultString);
        String[] strings = String.valueOf(resultString).split("\n");
        Arrays.stream(strings).forEach(System.out::println);
        System.out.println("String Length: " + strings[n-1].length());

//        int lastIndexOfLineBreak = resultString.length() - 2;
//        int prevIndexOfLineBreak = resultString.lastIndexOf("\n", lastIndexOfLineBreak - 1);
//        int substringLength = lastIndexOfLineBreak - prevIndexOfLineBreak;
//        System.out.println();
//        System.out.println(resultString.subSequence(prevIndexOfLineBreak, lastIndexOfLineBreak));
//
//        lastIndexOfLineBreak = prevIndexOfLineBreak;
//        prevIndexOfLineBreak = resultString.lastIndexOf("\n", lastIndexOfLineBreak - 1);
//        int substringLength2 = lastIndexOfLineBreak - prevIndexOfLineBreak;
//        System.out.println(resultString.subSequence(prevIndexOfLineBreak, lastIndexOfLineBreak));
//
        return null;
    }
}