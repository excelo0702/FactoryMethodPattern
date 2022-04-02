package WayneFactoryStore;

import ClotheStore.Clothes;

public abstract class WayneFactory {
    public Clothes orderClothe(String type) {
        Clothes clothes = createClothes(type);
        System.out.println("Description: "+clothes.getDescription());
        System.out.println("Price: "+clothes.getPrice());
        clothes.packing();

        return clothes;
    }

    public abstract Clothes createClothes(String type);
}
