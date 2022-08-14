package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        int a, b, h, counter = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        h = scanner.nextInt();

        if (a>=h){System.out.println(1);}
        else if(b>=a) { System.out.println("Impossible");}
        else {
            while (h > 0) {
                counter++;
                h = h - a;
                if (h <= 0) break;
                h = h + b;
            }
            System.out.println(counter);
        }
    }
}
