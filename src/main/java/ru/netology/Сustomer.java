package ru.netology;

import java.util.Scanner;

public class Сustomer {

    public void Order() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер товара который хотите заказать или введите 'end' для выхода");

        while (true) {
            String input = scanner.next();
            if (input.equals("end")) {
                System.out.println("Выход");
                break;
            } else {
                int inputProduct = Integer.parseInt(input);
                System.out.println("Заказан товар: " + (PriceListShop.priceList.get(inputProduct - 1).toString()));
                PriceListShop.priceList.remove(inputProduct - 1);

                break;
            }
        }

    }
}
