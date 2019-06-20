public abstract class Shoes implements Item {

    @Override
    public abstract float getPrice();

    @Override
    public abstract String getName();

    @Override
    public abstract String getSize();

    public static void showShoes() {
        System.out.println();
        System.out.println("Existing shoes:");
        System.out.println("Sandals");
        System.out.println("Sneakers");
        System.out.println("Boots");
    }


}
