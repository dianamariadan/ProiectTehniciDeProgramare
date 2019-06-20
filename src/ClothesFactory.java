public class ClothesFactory {
    public Clothes getClothesType(String clothesType){
        switch(clothesType) {
            case "Dress":
                return new Dress();
            case "Blouse":
                return new Blouse();
            case "Pants":
                return new Pants();
            default:
                return null;
        }
    }
}
