package com.company;

import java.io.Console;
import java.util.Scanner;



public class Start {

    public static void main(String[] args) {

        com.company.Game.Game game = new com.company.Game.Game();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ваша задача:\n ЖИТЬ!");

        System.out.println("_____________________________");
        System.out.println("немного дунув травы вам причудилась сказка про бабу Ягу,выберите где хотите оказаться:\n Укажите номер:\n Дома №1, В лесу №2, на улице №3 ");


        game.going(scanner.nextInt());




    }

}
