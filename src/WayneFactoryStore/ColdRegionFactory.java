package WayneFactoryStore;

import ClotheStore.Clothes;
import ClotheStore.KidsColdClothes;
import ClotheStore.MensColdClothes;
import ClotheStore.WomensColdClothes;

public class ColdRegionFactory extends WayneFactory{
    @Override
    public Clothes createClothes(String clotheType) {
        if(clotheType.equals("Mens")){
            return new MensColdClothes();
        } else if(clotheType.equals("Womens")) {
            return new WomensColdClothes();
        } else if(clotheType.equals("Kids")) {
            return new KidsColdClothes();
        } else {
            return new Clothes();
        }
    }
}
