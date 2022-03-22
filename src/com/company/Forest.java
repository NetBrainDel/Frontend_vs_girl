package com.company;

import java.util.Scanner;

public class Forest {
    Scanner scanner = new Scanner(System.in);


    public int forest (int n){

        switch (n){

            case 1:
                System.out.println("съел медведь");
                System.out.println("умер(легкая смерть)");
                break;
            case 2:

                System.out.println("искать ещё дозу ");


                int number = scanner.nextInt();
                return poisk (number);//2
            case 3:
                System.out.println("берлога медведя ");
                System.out.println("засосали до смерти (приятная смерть)");
                break;
        }
        return n;
    }
    public int poisk (int n){
        switch (n){

            case 1:
                System.out.println("нашел");
                int number = scanner.nextInt();
                return naxod (number);//1

            case 2:
                System.out.println(" не нашел ,умер от скуки(скучная смерть)");
                break;
            case 3:
                System.out.println("нашёл волчью ягоду,умер от поноса(страшная смерть)");
                break;
        }
        return n;
    }
    public int naxod (int n){
        switch (n){

            case 1:
                System.out.println("пошёл на зыбу до утра");
                System.out.println("ВЫЖИЛ");
                break;

            case 2:
                System.out.println("начал бегать голый за медведем");
                System.out.println("умер от холода(печальня смерть)");
                break;
            case 3:
                System.out.println("умер от передоза");
                System.out.println("лучшая смерть");
                break;
        }
        return n;

    }

}
