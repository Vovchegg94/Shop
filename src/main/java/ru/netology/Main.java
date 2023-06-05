package ru.netology;


public class Main {


    public static void main(String[] args) {
        PriceListShop priceListShop = new PriceListShop();
        SmartWatchProduct newWatch = new SmartWatchProduct("AppleWatch", "Series 7", 30000, "Apple");
        MobilePhoneProduct newMobilePhone = new MobilePhoneProduct("Xiaomi", "11T Pro", 40000, "Xiaomi");
        AudioPlayerProduct newAudioPlayer = new AudioPlayerProduct("Sony", "NWZ-B183F", 10000, "Sony");
        LaptopProduct newLaptop = new LaptopProduct("MacBook Air", "M2", 130000, "Apple");

        priceListShop.showAllProducts();
        Сustomer customer = new Сustomer();
        customer.Order();
        System.out.println("");
        priceListShop.filterNoMorePrice(35000);
        System.out.println("");
        priceListShop.filterPrice();
    }
}

