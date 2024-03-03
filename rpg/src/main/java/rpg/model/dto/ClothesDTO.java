package rpg.model.dto;

public class ClothesDTO extends ItemDTO {

    public ClothesDTO() {
    }

    public ClothesDTO(int itemCode, int itemCategory, String itemName, int itemPrice, int itemCharm) {
        super(itemCode, itemCategory, itemName, itemPrice, itemCharm);
    }

    @Override
    public String toString() {
        return "옷 : " +
                this.getItemName() + " / " +
                this.getItemPrice() + " / " +
                "매력도 + " + this.getItemCharm();
    }

}
