public class ShoesFactory {

    public static Shoes getShoeType(String shoeType){
        switch(shoeType) {
            case "Sandals":
                return new Sandals();
            case "Sneakers":
                return new Sneakers();
            case "Boots":
                return new Boots();
            default:
                return null;
        }
    }
}
