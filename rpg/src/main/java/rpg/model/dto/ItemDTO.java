package rpg.model.dto;

public class ItemDTO {

    private int itemCode;
    private int itemCategory;
    private String itemName;
    private int itemPrice;
    private int itemCharm;

    public ItemDTO() {
    }

    public ItemDTO(int itemCode, int itemCategory, String itemName, int itemPrice, int itemCharm) {
        this.itemCode = itemCode;
        this.itemCategory = itemCategory;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCharm = itemCharm;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public int getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(int itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemCharm() {
        return itemCharm;
    }

    public void setItemCharm(int itemCharm) {
        this.itemCharm = itemCharm;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "itemCode=" + itemCode +
                ", itemCategory=" + itemCategory +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemCharm=" + itemCharm +
                '}';
    }
}
