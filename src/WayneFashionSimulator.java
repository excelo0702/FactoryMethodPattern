import ClotheStore.Clothes;
import WayneFactoryStore.ColdRegionFactory;
import WayneFactoryStore.HotRegionFactory;
import WayneFactoryStore.WayneFactory;

public class WayneFashionSimulator {
    public static void main(String[] args) {
        System.out.println("\nOpened a new outlet in Cold Region\n");
        WayneFactory coldRegionFactory = new ColdRegionFactory();
        WayneFactory warmRegionFactory = new HotRegionFactory();

        Clothes coldRegionClothe = coldRegionFactory.orderClothe("Mens");
        System.out.println("\n\n");
        Clothes warmRegionClothe = warmRegionFactory.orderClothe("Mens");
        System.out.println("\n\n");

        // You can play around with clothe here

    }
}
