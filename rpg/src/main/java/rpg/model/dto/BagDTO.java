package rpg.model.dto;

public class BagDTO {

    private int bagCode;
    private int itemCode;
    private int userCode;

    public BagDTO() {
    }

    public BagDTO(int bagCode, int itemCode, int userCode) {
        this.bagCode = bagCode;
        this.itemCode = itemCode;
        this.userCode = userCode;
    }

    public int getBagCode() {
        return bagCode;
    }

    public void setBagCode(int bagCode) {
        this.bagCode = bagCode;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    @Override
    public String toString() {
        return "BagDTO{" +
                "bagCode=" + bagCode +
                ", itemCode=" + itemCode +
                ", userCode=" + userCode +
                '}';
    }

}
