public class ShoesFactory {

    public Shoes getShoeType(String shoeType){
        switch(shoeType) {
            case "Sandals":
                return new Sandales();
                break;
            case "Sneakers":
                return new Sneakers();
                break;
            case "Boots":
                return new Boots();
                break;
            default:
                return null;
        }
    }
}
