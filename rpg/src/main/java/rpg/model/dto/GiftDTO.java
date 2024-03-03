package rpg.model.dto;

public class GiftDTO extends ItemDTO {

    public GiftDTO() {
    }

    public GiftDTO(int itemCode, int itemCategory, String itemName, int itemPrice, int itemCharm) {
        super(itemCode, itemCategory, itemName, itemPrice, itemCharm);
    }

    @Override
    public String toString() {
        return "선물 : " +
                this.getItemName() + " / " +
                this.getItemPrice() + " / " +
                "NPC 호감도 + " + this.getItemCharm();
    }

}
