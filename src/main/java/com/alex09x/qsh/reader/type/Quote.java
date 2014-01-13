package com.alex09x.qsh.reader.type;

/**
 * Created by alex on 12.01.14.
 */
public class Quote {
    private final int price;
    private final int volume;
    private final QuoteType type;

    public Quote(int price, int volume, QuoteType type) {
        this.price = price;
        this.volume = volume;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    public QuoteType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "price=" + price +
                ", volume=" + volume +
                ", type=" + type +
                '}';
    }
}
