public class WayneFashionSimulator {
    public static void main(String[] args) {
        System.out.println("\nOpened a new outlet\n");
        WayneFashion outlet = new WayneFashion();
        System.out.println("\nOrder some clothes \n");
        outlet.orderClothe("Mens");
        outlet.orderClothe("Womens");
    }
}
