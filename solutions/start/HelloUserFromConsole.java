/*
Напишите программу, которая приветствует нового пользователя. В соответствии с примером.
Sample Input:          Peter
Sample Output:         Welcome, Peter!*/

import java.util.*;
import java.io.*;

public class HelloUserFromConsole {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String name = s.nextLine();
      System.out.println("Welcome, "+name+"!");
    }
}
