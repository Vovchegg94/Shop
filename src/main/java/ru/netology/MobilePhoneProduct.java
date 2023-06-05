package ru.netology;

public class MobilePhoneProduct extends Product implements CallTest, ClockTest, SMSTest, MusicPlayTest {
    final String typeString = "MobilePhone";

    public MobilePhoneProduct(String name, String model, int price, String producer) {
        super(name, model, price, producer);

        PriceListShop.priceList.add(this);
    }

    public void setAlarm(String time) {
        System.out.println("Будильник установлен на: " + time);
    }

    public void sendSMS(String msg, String number) {
        System.out.println("SMS с текстом: " + msg + " отправлена по номеру: " + number);
    }

    public void playMusic(String requestAudio) {
        System.out.println("Включена песня: " + requestAudio);
    }

    public void call(String number) {
        System.out.println("Вызов совершен по номеру: " + number);
    }

    @Override
    public String toString() {
        return "ID:" + (PriceListShop.priceList.indexOf(this) + 1) + " Название: " + this.name + " Модель: " + this.model + " Цена: " + this.price + " Производитель: " + this.producer;
    }

}



