public class ClothesFactory {
    public Clothes getClothesType(String clothesType){
        switch(clothesType) {
            case "Dress":
                return new Dress();
            break;
            case "Blouse":
                return new Blouse();
            break;
            case "Pants":
                return new Pants();
            break;
            default:
                return null;
        }
    }
}
