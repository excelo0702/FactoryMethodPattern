package WayneFactoryStore;

import ClotheStore.Clothes;
import ClotheStore.KidsWarmClothes;
import ClotheStore.MensWarmClothes;
import ClotheStore.WomensWarmClothes;


public class HotRegionFactory extends WayneFactory{
    @Override
    public Clothes createClothes(String clotheType) {
        if(clotheType.equals("Mens")){
            return new MensWarmClothes();
        } else if(clotheType.equals("Womens")) {
            return new WomensWarmClothes();
        } else if(clotheType.equals("Kids")) {
            return new KidsWarmClothes();
        } else {
            return new Clothes();
        }
    }
}
