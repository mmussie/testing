package com.mussie;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/*** This is test java class which calls random java classes
 * @author mgebregz
 *
 */
public class MyFirst {
    public static void main(final String[] args) {
        long startTime = System.nanoTime();
        int num = Integer.parseInt(args[0]);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        math_func mth = new math_func();
        all_sorts srt = new all_sorts();
        List<String> arms = new ArrayList<>();
        List<String> pal = new ArrayList<>();

        final String str = "1 8 9 2 3 6 yy zz aa Mussie Gebregziabiher testing";
        String[] arrOfStr = str.split(" ");
        List<String> xx = new ArrayList<>(Arrays.asList(arrOfStr));

        // srt.bubble_sort(arrOfStr)
        System.out.println("\n   Raw: " + str);
        System.out.print("Sorted: ");
        for ( String a : srt.bubble_sort(arrOfStr))
            System.out.print(a + " ");

        System.out.println("\n\nInput number: " + num);
        final LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        System.out.println("Fibonacci value for " + num + " is:  " + mth.fibonacci(num));
        System.out.println("Prime Number: " + mth.prime_num(num));
        for (int i = 0; i <= num; i++) {
            if (mth.armstrong(i))
                arms.add(String.valueOf(i));

            if (mth.palindrome(i))
                pal.add(String.valueOf(i));
        }
        System.out.print("Armsrong: ");
        for (final String a : arms)
            System.out.print(a + "|");
        System.out.print("\nPalindrom: ");
        for (final String a : pal)
            System.out.print(a + "|");
        System.out.print("\nArray List: ");
        for (final String a : xx)
            System.out.print(a+"|");

        final float durationInNano = (float)(System.nanoTime() - startTime)/1000000;
        System.out.println("\n\n"+durationInNano+" ms");
    }
}