public abstract class Clothes implements Item {

    @Override
    public abstract String getName();

    @Override
    public abstract float getPrice();

    @Override
    public abstract String getSize();

    public static void showClothes() {
        System.out.println();
        System.out.println("Existing clothes:");
        System.out.println("Dress");
        System.out.println("Blouse");
        System.out.println("Pants");
    }
}
