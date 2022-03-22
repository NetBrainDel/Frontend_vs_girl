package com.company;

import java.util.Scanner;

public class Outside {


      Scanner scanner = new Scanner(System.in);

        public int outside(int n) {
            switch (n) {
                case 1:
                    System.out.println("Его металлические когти ласкают стенки вашего желудка");
                    System.out.println("YOU DEAD");
                    break;
                case 2:
                    System.out.println("Попыться проснуться 1");
                    System.out.println("Попытыться заснуть 2");
                    System.out.println("Ничего не пытаться 3");
                    int number2 = scanner.nextInt();
                    return sear(number2);

                case 3:
                    System.out.println("Вы попытались ЖИТЬ, но вы ЗДОХЛИ");
                    break;

            }
            return n;

        }
        public int sear(int n){
            switch (n){
                case  1 :
                    System.out.println("с Фрэди не прошло");
                    System.out.println("YOU DEAD");
                    break;
                case 2 :
                    System.out.println("Да где там, так штырит - передоз");
                    System.out.println(" YOU DEAD");
                case 3 :
                    System.out.println("Дурь отпускает и Вы в аудитории № 704 ");
                    System.out.println("ВЫ ЖИВЫ");
                    break;
            }
            return n;

        }

}
