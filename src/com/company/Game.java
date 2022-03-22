package com.company.Game;

import com.company.Forest;
import com.company.Home;
import com.company.Outside;

import java.util.Scanner;

public class Game {


        Scanner scanner = new Scanner(System.in);

        Home home = new Home();
        Forest forest = new Forest();
        Outside outside = new Outside();



        public int going(int n) {
            switch (n) {
                case 1:
                    System.out.println("вы выбрали Дом. \n куда пойдем?");
                    System.out.println(" ");
                    System.out.println("Ванна 1");
                    System.out.println("Туалет 2");
                    System.out.println("Подвал 3");

                    int number = scanner.nextInt();
                    return home.home1(number);

                case 2:
                    System.out.println("Вы оказались в лесу.\nПеред вами три дороги: 1 прямо, 2 направо,  3 налево - что выбираем?");
                    int number1 = scanner.nextInt();
                    return forest.forest(number1);

                case 3:
                    System.out.println("Вы на Улица Вязов. \n Баба Яга Фрэдди ждёт выбираем: 1...?, 2...?, 3...?");
                    int number2 = scanner.nextInt();
                    return outside.outside(number2);
            }
            return n;
        }

}

