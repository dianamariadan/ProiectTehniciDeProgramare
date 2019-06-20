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
        Clothes clothes = ClothesFactory.getClothesType(clothesType);
        if(clothes != null) {
            outfit.addItem(clothes);
        }

        Shoes.showShoes();
        System.out.println("Choose shoes type: ");
        String shoesType = scanner.next();
        Shoes shoes = ShoesFactory.getShoeType(shoesType);
        if(shoes != null) {
            outfit.addItem(shoes);
        }

        return outfit;
    }

}
