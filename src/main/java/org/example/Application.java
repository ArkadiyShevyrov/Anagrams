package org.example;

import java.util.Scanner;

public class Application
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        System.out.println(Anagram.flipWordInLine(string));
    }


}
