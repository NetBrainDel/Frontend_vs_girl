package com.company;

import java.util.Scanner;

public class Home {
    Scanner scanner = new Scanner(System.in);
 Outside outside = new Outside();
                             /*Выбираем ванна туалет или подвал*/
    public int home1(int n) {
        switch (n) {
            case 1:
                System.out.println("что делаем в ванной?");
                System.out.println(" ");
                System.out.println("принять душ 1");
                System.out.println("не принимать душ 2");
                System.out.println("уйти 3");

                int number1 = scanner.nextInt();
                return bath(number1);
            case 2:
                System.out.println("что делаем в туалете?");
                System.out.println(" ");
                System.out.println("закрыть окно 1");
                System.out.println("посидеть на толчке 2");

                int number = scanner.nextInt();
                return wc(number);
            case 3:
                System.out.println("подвал");
                return basement();
        }
        return n;
    }

                                   /*Ванна*/
    public int bath(int n) {
        switch (n) {
            case 1:
                System.out.println("помылись и оказались на кухне");
                System.out.println(" ");
                System.out.println("Открыть холодильник 1");
                System.out.println("Приготовить на плите яички 2");
                System.out.println("Включить телевизор 3");
                int number = scanner.nextInt();
                return kitchen(number);
            case 2:
                System.out.println("не помылись");
                System.out.println("Вас учуяла баба Яга и нашла вас Game Over");
                break;
            case 3:
                System.out.println("ушли из ванны");
                System.out.println("Вас учуяла баба Яга и нашла вас Game Over");
                break;
        }

        return n;
    }

                               /*Туалет*/
    public int wc(int n) {
        if (n==2) {
            System.out.println("Game Over баба Яга утянула через окно");
            System.exit(0);
        }switch (n) {
            case 1:
                System.out.println("окно закрыли");
                System.out.println("можно спокойно посидеть");

            case 2:
                System.out.println("смыли и пошли на кухню");
                System.out.println(" ");
                System.out.println("Открыть холодильник 1");
                System.out.println("Приготовить на плите яички 2");
                System.out.println("Включить телевизор 3");

                int number = scanner.nextInt();
                return kitchen(number);

        }
        return n;
    }

                              /*Подвал*/
    public int basement() {
        System.out.println("Вас сожрала крыса Game Over");
        return 0;
    }

                   /*Идем дальше осталась Ванная и туалет*/
            /*Как помылись пошли на кухню*/
    public int kitchen(int n) {
        switch (n) {
            case 1:
                System.out.println("открыли холодильник и нашли грибы бабы яги");
                System.out.println(" ");
                System.out.println("что делаем с ними?");
                System.out.println("Съедаем 1");
                System.out.println("Несем на улицу посадить 2");
                System.out.println("Выбрасываем 3");
                int number = scanner.nextInt();
                return mushrooms(number);
            case 2:
                System.out.println("Вы разбили яйца о сковороду и оно вытекло на пол...вы подскользнулись и убились об плиту Game Over");
                break;
            case 3:
                System.out.println("Телевизор очень старый и он взорвался Game Over");
                break;
        }
        return n;
    }
                        /*Идем дальше остался холодильник*/

    public int mushrooms(int n){
        switch (n) {
            case 1:
                System.out.println("Съедаем ловим приход и не замечаем как нас зажарила баба Яга Game Over");
                break;
            case 2:
                System.out.println("Несем на улицу посадить");
                System.out.println("Вы на Улица Вязов. \n Баба Яга Фрэдди ждёт выбираем: 1...?, 2...?, 3...?");

                int number =scanner.nextInt();
                 return outside.outside(number);
            case 3:
                System.out.println("Выбрасываем вечно нельзя прятаться она вас по-любому найдет Game Over ");
                break;
        }
        return n;
    }
}

