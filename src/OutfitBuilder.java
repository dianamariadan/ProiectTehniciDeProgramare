import java.util.Scanner;

public class OutfitBuilder {
    
    public Outfit prepareSummerOutfit() {
        Outfit outfit = new Outfit();
        outfit.addItem(new Dress());
        outfit.addItem(new Sandals());
        return outfit;
    }

    public Outfit prepareWinterOutfit() {
        Outfit outfit = new Outfit();
        outfit.addItem(new Blouse());
        outfit.addItem(new Pants());
        outfit.addItem(new Boots());
        return outfit;
    }

    public Outfit customOutfit(){
        Outfit outfit= new Outfit();
        Clothes.showClothes();
        System.out.println("Choose clothes type: ");
        Scanner scanner = new Scanner(System.in);
        String clothesType = scanner.next();
        outfit.addItem(ClothesFactory.getClothesType(clothesType));

        Shoes.showShoes();
        System.out.println("Choose shoes type: ");
        String shoesType = scanner.next();
        outfit.addItem(ShoesFactory.getShoeType(clothesType));

        return outfit;
    }

}
