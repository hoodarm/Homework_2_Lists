package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        //Phase 1
        while (true)
        {
            String word = sc.next();
            if (word.equals("!"))
                break;
            else
                list.add(word);
            System.out.println(list);
        }

        //Phase 2
        while (true)
        {
            String word = sc.next();
            if (word.equals("!"))
                break;
            else if (list.contains(word))
                    System.out.println("hit");
        }
    }
}
