package homework.task2.shop.catalog.shirt;

import homework.task2.shop.catalog.parameters.FabricParameters;
import homework.task2.shop.catalog.parameters.Sizes;

public class Shirt {
    private Sizes sizes;
    private FabricParameters fabric;
    private double price;

    public Shirt(Sizes sizes, FabricParameters fabric, double price) {
        this.sizes = sizes;
        this.fabric = fabric;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}