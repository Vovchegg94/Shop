package ru.netology;

public class AudioPlayerProduct extends Product implements MusicPlayTest {
    final String typeString = "AudioPlayer";

    public AudioPlayerProduct(String name, String model, int price, String producer) {
        super(name, model, price, producer);
        PriceListShop.priceList.add(this);
    }

    public void playMusic(String requestAudio) {
        System.out.println("Включена песня: " + requestAudio);


    }

    @Override
    public String toString() {
        return "ID:" + (PriceListShop.priceList.indexOf(this) + 1) + " Название: " + this.name + " Модель: " + this.model + " Цена: " + this.price + " Производитель: " + this.producer;
    }
}
