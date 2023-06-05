package ru.netology;

import java.util.*;


public class PriceListShop {
    public static List<Product> priceList = new ArrayList<>();

    public void showAllProducts() {
        System.out.println("Текущий список товаров: ");
        for (Product product : priceList
        ) {
            System.out.println(product.toString());
        }
    }

    public void filterNoMorePrice(int price) {
        List<Product> FiltredProductList = priceList.stream()
                .filter(x -> x.getPrice() >= price)
                .toList();
        for (Product product :
                FiltredProductList) {
            System.out.println(product.toString());
        }
    }

    public void filterPrice() {

        List<Product> FiltredProductList = priceList.stream()

                .sorted(Comparator.comparing(Product::getPrice))
                .toList();
        for (Product product :
                FiltredProductList) {
            System.out.println(product.toString());
        }

    }
}








