import ClotheStore.Clothes;
import ClotheStore.KidsClothes;
import ClotheStore.MensClothes;
import ClotheStore.WomensClothes;

public class SimpleWayneFactory {
    public Clothes createClothe(String clotheType) {
        if(clotheType.equals("Mens")){
            return new MensClothes();
        } else if(clotheType.equals("Womens")) {
            return new WomensClothes();
        } else if(clotheType.equals("Kids")) {
            return new KidsClothes();
        } else {
            return new Clothes();
        }
    }
}
