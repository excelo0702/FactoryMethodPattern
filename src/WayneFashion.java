import ClotheStore.Clothes;

public class WayneFashion {

    // We can compose any factory here as our need
    ColdRegionFactory coldRegionFactory = new ColdRegionFactory();

    public WayneFashion() {
        System.out.println(" Opened \n");
    }

    public void orderClothe(String clotheType){
        Clothes clothe = coldRegionFactory.createClothe(clotheType);
        System.out.println("Description: "+clothe.getDescription());
        System.out.println("Price: "+ clothe.getPrice());
        clothe.packing();
    }

    //Flaws: When we need any new factory, we need to open this class and modify its functionality. Its not working
}
