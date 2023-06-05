package ru.netology;


public class SmartWatchProduct extends Product implements ClockTest, MusicPlayTest {

    public SmartWatchProduct(String name, String model, int price, String producer) {
        super(name, model, price, producer);
        this.typeString = "SmartWatch";
        PriceListShop.priceList.add(this);

    }

    public void setAlarm(String time) {
        System.out.println("Будильник установлен на: " + time);
    }

    public void playMusic(String requestAudio) {
        System.out.println("Включена песня: " + requestAudio);


    }

    @Override
    public String toString() {
        return "ID:" + (PriceListShop.priceList.indexOf(this) + 1) + " Название: " + this.name + " Модель: " + this.model + " Цена: " + this.price + " Производитель: " + this.producer;
    }

}
