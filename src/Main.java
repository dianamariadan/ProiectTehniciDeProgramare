public class Main {

    public static void main(String[] args) {

        OutfitBuilder outfitBuilder = new OutfitBuilder();

        Outfit summerOutfit = outfitBuilder.prepareSummerOutfit();
        System.out.println("Summer Outfit");
        summerOutfit.showItems();
        System.out.println("Total Cost: " + summerOutfit.getCost());

        Outfit winterOutfit = outfitBuilder.prepareWinterOutfit();
        System.out.println("Winter Outfit");
        winterOutfit.showItems();
        System.out.println("Total Cost: " + winterOutfit.getCost());

        Outfit customOutfit = outfitBuilder.customOutfit();
        System.out.println("Custom Outfit");
        customOutfit.showItems();
        System.out.println("Total Cost: " + customOutfit.getCost());

    }


}
