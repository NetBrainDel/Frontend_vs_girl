package com.company;

import java.util.Scanner;

public class Forest {
    Scanner scanner = new Scanner(System.in);


    public int forest (int n){

        switch (n){

            case 1:
                System.out.println("съел медьведь");
                System.out.println("конец");
                break;
            case 2:
                System.out.println("сесть какать 1");
                System.out.println("искать ещё дозу 2");
                System.out.println("поговорить с белкой 3");

                int number = scanner.nextInt();
                return search (number);//2
            case 3:
                System.out.println("берлога медьведя ");
                break;
        }
        return n;
    }
    public int search (int n){
        switch (n){

            case 1:
                System.out.println("нашел");
                break;
            case 2:
                System.out.println("умер от скуки");
                break;
            case 3:
                System.out.println("нашёл волчью ягоду");
                break;
        }
        return n;
    }
}


