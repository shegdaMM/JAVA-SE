/*
Напишите программу, которая выводит первые две цифры трехзначного числа
Sample Input:         341
Sample Output:        34
*/

import java.util.*;
class PrintFirstTwoInt {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int a=s.nextInt();
       int result=a/10;
       System.out.println(result);
    }
}
