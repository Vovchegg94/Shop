package ru.netology;


public class LaptopProduct extends Product implements ClockTest, SupportCOMPortTest, MusicPlayTest {


    private boolean COMPort;

    public LaptopProduct(String name, String model, int price, String producer) {
        super(name, model, price, producer);
        this.COMPort = true;
        this.typeString = "LAPTOP";
        PriceListShop.priceList.add(this);
    }

    public LaptopProduct(String name, String model, int price, String producer, boolean COMPort) {
        super(name, model, price, producer);
        this.typeString = "LAPTOP";
        this.COMPort = COMPort;
        PriceListShop.priceList.add(this);
    }

    public void SupportCOMPort() {
        if (this.COMPort) {
            System.out.println("Данный ноутбук имеет COM-порт");
        }
    }

    public void playMusic(String requestAudio) {
        System.out.println("Включена песня: " + requestAudio);


    }

    public void setAlarm(String time) {
        System.out.println("Будильник установлен на: " + time);
    }

    @Override
    public String toString() {
        return "ID:" + (PriceListShop.priceList.indexOf(this) + 1) + " Название: " + this.name + " Модель: " + this.model + " Цена: " + this.price + " Производитель: " + this.producer;
    }

}
