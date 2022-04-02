import ClotheStore.Clothes;

public class WayneFashion {
    SimpleWayneFactory simpleFactory = new SimpleWayneFactory();

    public WayneFashion() {
        System.out.println(" Opened \n");
    }

    public void orderClothe(String clotheType){
        Clothes clothe = simpleFactory.createClothe(clotheType);
        System.out.println("Description: "+clothe.getDescription());
        System.out.println("Price: "+ clothe.getPrice());
        clothe.packing();
    }
}
