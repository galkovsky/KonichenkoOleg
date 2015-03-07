package com.company;

import java.util.Scanner;

class DistCount {
        public double distCounter (char x, char x1, char y,  char y1){
        return (Math.sqrt(Math.pow((x - x1), 2)+Math.pow((y - y1), 2)));
    }
}

public class Main {

    public static void main(String[] args) {
        DistCount horse = new DistCount();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a knight's move");
        String g = scan.nextLine();
        char x = g.charAt(0);  // returns 'l'
        char y = g.charAt(1);
        char x1 = g.charAt(2);
        char y1 = g.charAt(3);

        double dist = horse.distCounter(x, x1, y, y1);
        if (dist == Math.sqrt(5) ) {
            System.out.println("This is a right horse position");
        } else {
            System.out.println("This is a wrong position");
        }
        System.out.println(dist);
    }

}