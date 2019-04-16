/*
  
Напишите программу, которая считает введенные числа по следующей формуле a+b-c. Первое число вводиться с, второе b, третье а.
Sample Input:  8 -> 6 -> 8
Sample Output: 6
*/
import java.util.*;

class ReadABCAndResult {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        int b = s.nextInt();
        int a = s.nextInt();
        System.out.println(a+b-c);
    }
}
